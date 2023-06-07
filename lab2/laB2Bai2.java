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
public class laB2Bai2 {

    public static void main(String[] args) {

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
}
