/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.awt.Menu;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NewClass {

    public static void main(String[] args) {
        thucDon();
    }

    private static void thucDon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 cong");
        System.out.println("2 tru");
        System.out.println("3 nhan");
        System.out.println("4 thoat");
        System.out.println("hay chon chuc nang ma ban muon: ");
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                cong();
                break;
            case 2:
                tru();
                break;
            case 3:
                nhan();
                break;
            case 4:
                System.exit(4);
                break;

            default:
                System.out.println("hay chon trong khoang tu 1 den 4");
        }
    }

    private static void cong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap a: ");
        int a = sc.nextInt();
        System.out.println("hay nhap b: ");
        int b = sc.nextInt();

        System.out.println("tong a+b la: " + (a + b));

    }

    private static void tru() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap a: ");
        int a = sc.nextInt();
        System.out.println("hay nhap b: ");
        int b = sc.nextInt();

        System.out.println("tong a+b la: " + (a - b));
    }

    private static void nhan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap a: ");
        int a = sc.nextInt();
        System.out.println("hay nhap b: ");
        int b = sc.nextInt();

        System.out.println("tong a+b la: " + (a * b));
    }
}
