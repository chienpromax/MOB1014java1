/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author DELL
 */
public class laB2Bai1 {

    public static void main(String[] args) {
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

}
