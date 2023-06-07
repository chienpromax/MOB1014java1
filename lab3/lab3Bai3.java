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
public class lab3Bai3 {

    public static void main(String[] args) {
        int[] a = new int[20];
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap so phan tu mang n: ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]");
            a[i] = sc.nextInt();
        }
        
        //xap xep in mang
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int d = a[i];
                    a[i] = a[j];
                    a[j] = d;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + "");

        }
        int m = a[0];
        for (int i = 0; i < n; i++) {
            m = Math.min(m, a[i]);
        }
        System.out.println("so be nhat la: " + m);

        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                dem += 1;
            }
        }
        System.out.println("TBC la:" + (double) tong / dem);
    }
}
