/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class applab6bai2 {
    static  ArrayList<lab6bai2> ds=new ArrayList<>();
    
    public static void main(String[] args) {
        nhap();
        xuat("apple");
        
    }

    private static void nhap() {
        ds.add(new lab6bai2("DT1",5000,"apple"));
        ds.add(new lab6bai2("DT2",4000,"htc"));
        ds.add(new lab6bai2("DT3",55000,"nokia"));
        ds.add(new lab6bai2("DT4",3000,"samsung"));
        ds.add(new lab6bai2("DT5",15000,"oppo"));
    }

    private static void xuat(String hang) {
        for (lab6bai2 sp : ds) {
            if(sp.hang.equalsIgnoreCase(hang)){
                System.out.println(sp);
            }
        }
    }
    
}
