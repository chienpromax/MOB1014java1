package phanMemQLNS;

import java.security.interfaces.DSAKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLiNV {

    static ArrayList<nhanVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=============menu==============");
            System.out.println("1. nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh.");
            System.out.println("3. Tim va hien thi nhan vien theo ma");
            System.out.println("4. Xoa nhan vien theo ma ");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma ");
            System.out.println("6. Tim cac nhan vien theo khoang luong ");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("0. thoat");
            System.out.println("moi ban chon chuc nang");
            System.out.println("===============================");
            int chon = 0;
            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("ban phai nhap so nguyen");
                continue;
            }
            switch (chon) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    timVaHienThiTheoMa();
                    break;
                case 4:
                    xoaNV();
                    break;
                case 5:
                    capNhatTT();
                    break;
                case 6:
                    timNVTheoKhoangLuong();
                    break;
                case 7:
                    xapXepNVTheoTen();
                    break;
                case 8:
                    xapXepNVTheoThuNhap();
                    break;
                case 9:
                    xuat5NVTop();
                    break;
                case 0:
                    System.err.println("byeeee");
                    System.exit(0);
                default:
                    System.out.println("hay chon chuc nang tu 0 -> 9");
            }
        }
    }

    private static void nhapDanhSach() {
         do {
            Scanner sc = new Scanner(System.in);
            System.out.println("moi chon so: 1.nhan vien hanh chinh 2.truong phong 3.tiep thi 0.de thoat");
            int chon = 0;
            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("ban phai nhap so nguyen");
                continue;
            }
            switch (chon) {
                case 1:
                    nhanVienHanhChinh nvhc = new nhanVienHanhChinh();
                    nvhc.nhapTT();
                    ds.add(nvhc);
                    break;
                case 2:
                    truongPhong tp = new truongPhong();
                    tp.nhapTT();
                    ds.add(tp);
                    break;
                case 3:
                    tiepThi tt = new tiepThi();
                    tt.nhapTT();
                    ds.add(tt);
                    break;
                default:
                    System.out.println("nhap tu 0 den 3");
            }
            if (chon == 0) {
                break;
            }
        } while (true);
    }
    private static void xuatDanhSach() {
        System.out.println("danh sach nhan vien");
        for (nhanVien nv : ds) {
            if (nv instanceof nhanVienHanhChinh) {
                ((nhanVienHanhChinh) nv).xuat();
            } else if (nv instanceof tiepThi) {
                ((tiepThi) nv).xuat();
            } else if (nv instanceof truongPhong) {
                ((truongPhong) nv).xuat();
            }
        }
    }

    private static void timVaHienThiTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap ma nhan vien can tim");
        String manv = sc.nextLine();
        for (nhanVien nv : ds) {
            if (nv.getMaNV().equalsIgnoreCase(manv)) {
                System.out.println("nhan vien can tim la");
                if (nv instanceof nhanVienHanhChinh) {
                    nv.xuat();
                } else if (nv instanceof truongPhong) {
                    nv.xuat();
                } else if (nv instanceof tiepThi) {
                    nv.xuat();
                }
                break;
            } else {
                System.out.println("khong tim thay nhan vien");
            }
        }
    }


    private static void xoaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao ma nhan vien can xoa");
        String xoaNV = sc.nextLine();
        for (nhanVien nv : ds) {
            if (nv.maNV.equalsIgnoreCase(xoaNV)) {
                ds.remove(nv);
                nv.xuat();
                System.out.println("nhan vien da duoc xoa");
                break;
            } else {
                System.out.println("khong tim thay nhan vien");
            }
        }
    }

    private static void capNhatTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap ma nhan vien can cap nhat");
        String manv = sc.nextLine();
        for (nhanVien nv : ds) {
            if (nv.getMaNV().equalsIgnoreCase(manv)) {
                System.out.println("nhap thong tin moi");
                if (nv instanceof nhanVienHanhChinh) {
                    nv.nhapTT();
                } else if (nv instanceof truongPhong) {
                    nv.nhapTT();
                } else if (nv instanceof tiepThi) {
                    nv.nhapTT();
                    break;
                } else {
                    System.out.println("khong tim thay nhan vien");
                }
            }
        }
    }
    private static void timNVTheoKhoangLuong() {
        double bD = 0, kT = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap khoang luong bat dau");
            bD = sc.nextDouble();
            System.out.println("nhap khoang luong ket thuc");
            kT = sc.nextDouble();
            if (bD > kT) {
                System.out.println("nhap lai khoang luon");
            } else {
                break;
            }
        } while (true);
        boolean tim = false;
        for (nhanVien nv : ds) {
            if (bD <= nv.getThuNhap() && nv.getThuNhap() <= kT) {
                nv.xuat();
                System.out.println();
                tim = true;
            }
        }
        if (tim = false) {
            System.out.println("Khong co nhan vien nao co luong trong khoang can tim");
        }

    }


    private static void xapXepNVTheoTen() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv1.getHoTen().compareTo(nv2.getHoTen())));
        System.out.println("chon 2 de xuat danh sach sau khi sap xep");
    }

    private static void xapXepNVTheoThuNhap() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv2.getThuNhap() - (nv1.getThuNhap())));
        System.out.println("chon 2 de xuat danh sach sau khi sap xep");
    }

    private static void xuat5NVTop() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv2.getThuNhap() - (nv1.getThuNhap())));
        System.out.println("danh sach sau khi sap xep");
        for (int i = 0; i < 5 && i < ds.size(); i++) {
            ds.get(i).xuat();
        }
    }
}
