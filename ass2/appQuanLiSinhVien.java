/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanMemQLNS;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class appQuanLiSinhVien {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        cacChucNang chucNang = new cacChucNang();
        Scanner sc=new Scanner(System.in);
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
                    chucNang.nhapDS();
                    break;
                case 2:
                    chucNang.xuatDanhSach();
                    break;
                case 3:
                    chucNang.timTheoMa();
                    break;
                case 4:
                    chucNang.xoaTheoMa();
                    break;
                case 5:
                    chucNang.capNhatTT();
                    break;
                case 6:
                    chucNang.timNVTheoKhoangLuong();
                    break;
                case 7:
                    chucNang.xapXepNVTheoHoTen();
                    break;
                case 8:
                    chucNang.xapXepNVTheoThuNhap();
                    break;
                case 9:
                    chucNang.top5ThuNhap();
                    break;
                case 0:
                    System.err.println("byeeee");
                    System.exit(0);
                default:
                    System.out.println("hay chon chuc nang tu 0 -> 9");
            }
        }
    }
}
