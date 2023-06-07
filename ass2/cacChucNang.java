/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanMemQLNS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class cacChucNang {

    ArrayList<nhanVien> ds = new ArrayList<>();

    public void nhapDS() {
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

    public void xuatDanhSach() {
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

    public void timTheoMa() {
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

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao ma nhan vien can xoa");
        String xoaNV = sc.nextLine();
        boolean tim = true;
        for (nhanVien nv : ds) {
            if (nv.maNV.equalsIgnoreCase(xoaNV)) {
                tim = true;
                ds.remove(nv);
                nv.xuat();
                System.out.println("nhan vien da duoc xoa");
                break;
            }
            if (tim = false) {
                System.out.println("khong tim thay nhan vien");
            }
        }
    }

    public void capNhatTT() {
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

    public void timNVTheoKhoangLuong() {
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
                tim = true;
                nv.xuat();
                System.out.println();
            }
            if (tim = false) {
                System.out.println("Khong co nhan vien nao co luong trong khoang can tim");
            }
        }
    }

    public void xapXepNVTheoHoTen() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv1.getHoTen().compareTo(nv2.getHoTen())));
        System.out.println("chon 2 de xuat danh sach sau khi sap xep");
    }

    public void xapXepNVTheoThuNhap() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv2.getThuNhap() - (nv1.getThuNhap())));
        System.out.println("chon 2 de xuat danh sach sau khi sap xep");
    }

    public void top5ThuNhap() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv2.getThuNhap() - (nv1.getThuNhap())));
        System.out.println("danh sach sau khi sap xep");
        for (int i = 0; i < 5 && i < ds.size(); i++) {
            ds.get(i).xuat();
        }
    }
}
