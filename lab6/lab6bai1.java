/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class lab6bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hay nhap ho va ten");
        String hoTen=sc.nextLine();
        hoTen = hoTen.trim();
        String[] ht = hoTen.split("\\s+");
        if (ht.length < 3) {
            System.out.println("Ten phai co day du ho, ten dem, ten");
            return;
        }
        System.out.println("Ho viet hoa: " + ht[0].toUpperCase());
        System.out.println("Ten dem viet thuong: " + ht[1].toLowerCase());
        System.out.println("Ten viet hoa: " + ht[2].toUpperCase());
    }

        
    }
