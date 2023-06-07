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
public class laB1Bai1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.print("Ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Diem TB: ");
            double diemTB = scanner.nextDouble();

            System.out.println(hoTen + diemTB + "diem");
        }
    }
}
