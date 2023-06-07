package ass1;

import java.util.Scanner;

public class appass1 {

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
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("0. thoat");
            System.out.println("moi ban chon chuc nang");
            System.out.println("===============================");
            int chon = 0;
            try {
                chon=Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("ban chon chuc nang tu 0 den 9");
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
                    timNVTheoLuong();
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
        System.out.println("ban chon chuc nang nhap danh sach");
    }

    private static void xuatDanhSach() {
        System.out.println("ban chon chuc nang xuat danh sach");
    }

    private static void timVaHienThiTheoMa() {
        System.out.println("ban chon chuc nang tim va hien thi theo ma");
    }

    private static void xoaNV() {
        System.out.println("ban chon chuc nang xoa nhan vien");
    }

    private static void capNhatTT() {
        System.out.println("ban chon chuc nang cap nhat thong tin");
    }

    private static void timNVTheoLuong() {
        System.out.println("ban chon chuc nang tim nan vien theo luong");
    }

    private static void xapXepNVTheoTen() {
        System.out.println("ban chon chuc nang xap xep nhan vien theo ten");
    }
    
    private static void xapXepNVTheoThuNhap() {
        System.out.println("ban chon chuc nang xap xep nhan vien theo thu nhap");
    }

    private static void xuat5NVTop() {
        System.out.println("ban chon chuc nang xuat 5 nhan vien co thu nhap cao nhat");
    }

}