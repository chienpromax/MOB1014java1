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
public class laB1Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("hay nhap vao a: ");
        double a = scanner.nextDouble();
        
        System.out.println("hay nhap vao b: ");
        double b = scanner.nextDouble();
        
        System.out.println("hay nhap vao c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        System.out.println("can bac hai cua " + delta + "la" + Math.sqrt(delta));
        
    }
    
}
