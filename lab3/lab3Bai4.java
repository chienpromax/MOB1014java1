/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

public class lab3Bai4 {

    public static void main(String[] args) {
        int SI_SO = 20;
        double diem[] = new double[SI_SO];
        String ten[] = new String[SI_SO];
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("hay nhap so phan tu n:");
            n = Integer.parseInt(sc.nextLine());
        } while (n <= 0 || n > SI_SO);
        for (int i = 0; i < n; i++) {
            System.out.println("diem s[" + i + "]=");
            diem[i] = Double.parseDouble(sc.nextLine());
            System.out.println("ten s[" + i + "]=");
            ten[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double tam = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tam;

                    String x = ten[i];
                    ten[i] = ten[j];
                    ten[j] = x;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ten[i]+" "+diem[i]+"hoc luc: "+hocLuc(diem[i]));
        }
    }

    private static String hocLuc(double d) {
        if (d < 5) {
            return "yeu";
        } else if (d < 6.5) {
            return "trung binh";
        } else if (d < 7.5) {
            return "kha";
        } else if (d < 9) {
            return "gioi";
        } else {
            return "xuat xac";
    
        }
    }
}
