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
public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao thang");
        int thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("thang"+thang+" co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang"+thang+" co 31 ngay");
                break;
            case 2:
                System.out.println("hay nhap nam");
                int nam = sc.nextInt();
                if ((nam %4==0 && nam%100!=0 )||(nam%400==0)){
                    System.out.println("thang 2 co"+nam+"co 29 ngay");
                }else {
                        System.out.println("thang 2 co"+nam+"co 28 ngay");
                        }
                break;
            default:
                System.out.println("nhap dung so");
               
        }
    }
}
