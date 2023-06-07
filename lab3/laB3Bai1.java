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
public class laB3Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao 1 so:");
        int so = sc.nextInt();

        boolean ok = true;
        if (so < 1) 
            ok = false;
        
        for (int i = 2; i < so; i++) {
            if (so % i == 0) {
                ok = false;
                break;
            }

        }
        if (ok == false) 
            System.out.println("khong phai so nguyen to");
         else 
            System.out.println(" phai so nguyen to");
        
    }

}
