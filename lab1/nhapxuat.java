/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class nhapxuat {

    public static void main(String[] args) {
        // ấn Sca
        // int tuoi=Integer.parseInt(sc,)
        Scanner sc = new Scanner(System.in);
       
        System.out.println("moi nhap ten ");
        String hoTen = sc.nextLine();
        
        System.out.println("moi nhap tuoi ");
        int tuoi = sc.nextInt();
        
        System.out.println(hoTen + "nam nay" + tuoi + "tuoi");
        System.out.print(hoTen + "nam nay" + tuoi + "tuoi");
        System.out.printf("%s nam nay %d tuoi", hoTen, tuoi);
        
        
        
        
        

    }
}
