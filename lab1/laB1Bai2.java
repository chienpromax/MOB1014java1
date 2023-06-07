/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class laB1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap chieu dai: ");
        double dai = scanner.nextDouble();
        System.out.print("hay nhap chieu rong: ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        System.out.println("chu vi la" + chuVi);
        System.out.println("dien tich la" + dienTich);
        System.out.println("canh nho la" + canhNho);
       
        

    }
}