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
            nv.xuat();
        }
    }

    public void timTheoMa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap ma nhan vien can tim");
        String manv = sc.nextLine();
        for (nhanVien nv : ds) {
            if (nv.getMaNV().equalsIgnoreCase(manv)) {
                System.out.println("nhan vien can tim la");
                nv.xuat();
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
                }
                break;
            } else {
                System.out.println("khong tim thay nhan vien");
            }
        }
    }

    public void timNVTheoKhoangLuong() {
        double bd = 0, kt = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap khoang luong bat dau");
            bd = sc.nextDouble();
            try {
                bd = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("ban phai nhap so nguyen");
                continue;
            }
            System.out.println("nhap khoang luong ket thuc");
            kt = sc.nextDouble();
            try {
                kt = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("ban phai nhap so nguyen");
                continue;
            }
            if (bd > kt) {
                System.out.println("nhap lai khoang luon");
            } else {
                break;
            }
        } while (true);
        for (nhanVien nv : ds) {
            if (nv.getThuNhap() >= bd && nv.getThuNhap() <= kt) {
                if (nv instanceof nhanVienHanhChinh) {
                    nv.xuat();
                    break;
                } else if (nv instanceof truongPhong) {
                    nv.xuat();
                } else if (nv instanceof tiepThi) {
                    nv.xuat();
                } else {
                    System.out.println("khong tim thay nhan vien");
                }
                break;
            }
        }
    }

    public void xapXepNVTheoTen() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv1.getHoTen().compareTo(nv2.getHoTen())));
    }

    public void xapXepNVTheoThuNhap() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv2.getThuNhap() - (nv1.getThuNhap())));
    }

    public void top5ThuNhap() {
        Collections.sort(ds, (nv1, nv2) -> (int) (nv2.getThuNhap() - (nv1.getThuNhap())));
        Collections.reverse(ds);
        System.out.println("danh sach sau khi sap xep");
        for (int i = 0; i < 5 && i < ds.size(); i++) {
            ds.get(i).xuat();
        }
    }
}
