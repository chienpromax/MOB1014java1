package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class quanLiSinhVien {

    static ArrayList<lab7Bai2SinhVienPoly> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("========menu=========");
            System.out.println("1. nhap danh sach sinh vien");
            System.out.println("2. xuat danh sach sinh vien");
            System.out.println("3. xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. xap xep danh sach sinh vien theo diem");
            System.out.println("0. thoat");
            System.out.println("=======================");
            System.out.println("nhap chuc nang ban muon");
            int chon = 0;
            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("nhap so nguyen to 0 den 4");
                continue;
            }
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatHocLuc();
                    break;
                case 4:
                    sapXep();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("phai nhap chuc nang tu 0 den 4");
            }

        }
    }

    private static void nhap() {
        for (int i = 0; i < 3; i++) {

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("nhap vao ten sinh vien");
                String hoTen = sc.nextLine();
                if (hoTen == null || hoTen.equals("")) {
                    break;
                }
                System.out.println("hay nhap vao nganh (it hoac biz): ");
                String nganh = sc.nextLine();
                if (nganh.equalsIgnoreCase("it")) {
                    System.out.println("hay nhap diem java:");
                    double diemJava = sc.nextDouble();
                    System.out.println("hay nhap diem html:");
                    double diemHTML = sc.nextDouble();
                    System.out.println("hay nhap diem Css:");
                    double diemCss = sc.nextDouble();
                    lab7Bai2SinhVienPoly sv = new sinhVienIT(diemJava, diemHTML, diemCss, hoTen, nganh);
                    ds.add(sv);
                    break;
                } else if (nganh.equalsIgnoreCase("biz")) {
                    System.out.println("hay nhap diem MKT:");
                    double diemMKT = sc.nextDouble();
                    System.out.println("hay nhap diem Seles:");
                    double diemSales = sc.nextDouble();
                    lab7Bai2SinhVienPoly sv = new sinhVienBiz(diemMKT, diemSales, hoTen, nganh);
                    ds.add(sv);
                } else {
                    System.err.println("ban phai nhap nganh hoc dung");
                }
            }
        }
    }

    private static void xuat() {
        for (lab7Bai2SinhVienPoly sv : ds) {
            sv.xuat();
        }
    }

    private static void xuatHocLuc() {
        for (lab7Bai2SinhVienPoly sv : ds) {
            if (sv.getHocLuc().equalsIgnoreCase("gioi")) {
                sv.xuat();
            }
        }
    }

    private static void sapXep() {
        Collections.sort(ds, (a, b) -> (int) (a.getDiem() - b.getDiem()));
        System.out.println("danh sach sau khi sap xep");
        for (lab7Bai2SinhVienPoly sv : ds) {
        }
        xuat();
    }

}
