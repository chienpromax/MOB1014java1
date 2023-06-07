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
public class laB1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap vao canh khoi lap phuong: ");
        double canh = scanner.nextDouble();
        double thetich=canh*canh*canh;
        
        System.out.println("the tich khoi lap phuong la: "+thetich);
        
    }
}