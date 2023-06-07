/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class lab2Bai4 {

    public static void main(String[] args) {
        thucDon();

    }

    private static void thucDon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. giai phuong trinh bac nhat");
        System.out.println("2. gia phuong tinh bac hai");
        System.out.println("3. tinh tien dien");
        System.out.println("4. ket thuc");
        System.out.println("moi ban chon chuc nang");
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                giaiPhuongTrinhBacMot();
                break;
            case 2:
                giaiPhuongTrinhBacHai();
                break;
            case 3:
                tinhTienDien();
                break;
            case 4:
                System.out.println("byeeee");
                System.exit(0);
            default:
                System.out.println("hay chon tu 0 den 4");
        }
    }

    private static void giaiPhuongTrinhBacMot() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("hay nhap vao a:");
            double a = sc.nextDouble();

            System.out.println("hay nhap vao b:");
            double b = sc.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("phuong trinh co vo so nghiem");
                } else {
                    System.out.println("phuong trinh co vo so nghiem");
                }
            } else {

                System.out.printf("nghiem la %.2f", (-b) / a);
            }
        } catch (Exception e) {
            System.out.println("hay nhap chu so");
        }

    }

    private static void giaiPhuongTrinhBacHai() {
        Scanner sc = new Scanner(System.in);

        System.out.println("hay nhap vao a");
        double a = sc.nextDouble();

        System.out.println("hay nhap vao b");
        double b = sc.nextDouble();

        System.out.println("hay nhap vao c");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo so ngiem");
                } else {
                    System.out.println("phung trinh vo nghiem");
                }
            } else {
                System.out.printf("nghiem la %.2f", (-b) / a);
            }
        } else {
            double de = (b * b) - 4 * (a * c);
            if (de < 0) {
                System.out.println("vo nghiem");
            } else if (de == 0) {
                System.out.println("co nghiem kep" + -b / (2 * a));
            } else {
                System.out.println("co hai nghiem phan biet");
                System.out.printf("nghiem x1 la %.2f", (-b + Math.sqrt(de)) / (2 * a));
                System.out.printf("nghiem x1 la %.2f", (-b - Math.sqrt(de)) / (2 * a));
            }
        }
    }

    private static void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao so dien");
        int soKW = sc.nextInt();
        double tien = 0;
        if (soKW <= 50) {
            tien = soKW * 1000;
        } else {
            tien = 50 * 1000 + (soKW - 50) * 1200;
        }
        System.out.println("so tien phai tra la" + tien);
    }
}
