
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class appSinhVienBai3arr {

    static ArrayList<SinhVienBai3> ds = new ArrayList<>();

    public static void main(String[] args) {
        nhap();
        xuat();
    }

    public static void xuat() {
    }

    private static void nhap() {
        Scanner sc = new Scanner(System.in);
        String hoTen;
        String Email;
        String soDT;
        String CMND;
        while (true) {
            System.out.println("hay nhap ho ten sinh vien");
            hoTen = sc.nextLine();
            String rehoTen = "[a-zA-Z ]+";
            if (hoTen.matches(rehoTen)) {
                break;
            } else {
                System.out.println("ban nhap sai");
            }
        }
        while (true) {
            System.out.println("hay nhap Email sinh vien");
            Email = sc.nextLine();
            String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
            if (Email.matches(reEmail)) {
                break;
            } else {
                System.out.println("ban nhap sai");
            }
        }
        while (true) {
            System.out.println("hay nhap so dien thoai sinh vien");
            soDT = sc.nextLine();
            String rephone = "0\\d{9}";
            if (soDT.matches(rephone)) {
                break;
            } else {
                System.out.println("ban nhap sai");
            }
        }
        while (true) {
            System.out.println("hay nhap so CMND nhan vien");
            CMND = sc.nextLine();
            String reCMND = "\\d{10}";
            if (CMND.matches(reCMND)) {
                break;
            } else {
                System.out.println("ban nhap sai");
            }
        }
    }
}
