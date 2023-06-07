/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class demo4 {

    public static void main(String[] args) {
        int[] a = new int[100];//mạng 
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap so phan tu n");
        n = sc.nextInt();
        nhapMang(a, n);
        System.out.println("tbc la:" + tinhtbc(a, n));
    }

    private static void nhapMang(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]i=");
            a[i] = sc.nextInt();

        }
    }

    private static double tinhtbc(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        return (double) tong / n;
    }

}
