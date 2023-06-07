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
public class lab2Bai3 {

    public static void main(String[] args) {
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
