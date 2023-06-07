/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class dSSoThuc {
    static ArrayList<Double> st =new ArrayList<>();  
    
    void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap danh sach so thuc: ");
        int yes=1;
        do {            
            System.out.println("hay nhap vao so: ");
            double so  = sc.nextDouble();
            
            st.add(so);
            System.out.println("ban mon nhap tiep khong 1 co 0 thoat");
            yes =sc.nextInt();
             } while (yes==1);        
        }
    void xuat(){
        System.out.println("===========");
        for (Double ds : st) {
            System.out.println("  "+ds);    
        }
        System.out.println("  ");
    }
    void tinhTong(){
        double tong=0;
        for (Double ds : st) {
            tong +=ds;   
        }
        System.out.println("tong: "+tong);
    }
    }

