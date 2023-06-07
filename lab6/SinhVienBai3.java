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
public class SinhVienBai3 {
private String hoTen;
    private String email;
    private String phone;
    private String cmnd;

    public SinhVienBai3(String hoTen, String email, String phone, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.phone = phone;
        this.cmnd = cmnd;
    }

    public SinhVienBai3() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.println("Moi nhap ho va ten: ");
        hoTen = sc.nextLine();
        kiemTra ds = new kiemTra();
       
        do {
            System.out.println("Moi nhap so CMND: ");
            cmnd = sc.nextLine();
            if (ds.isCMND(cmnd)) {
                System.out.println("CMND hop le");
                break;
            } else {
                System.out.println("CMND khong lop le. Moi nhap lai theo cu phap \\d{12}");
            }
        } while (true);
         do {
            System.out.println("Moi nhap email: ");
            email = sc.nextLine();
            if (ds.isEmail(email)) {
                System.out.println("Email hop le");
                break;
            } else {
                System.out.println("Email khong lop le. Moi nhap lai theo cu phap: \\w+@\\w+(\\.\\w){1,2}");
            }
        } while (true);
        do {
            System.out.println("Moi nhap so dien thoai: ");
            phone = sc.nextLine();
            if (ds.isSoDienThoai(phone)) {
                System.out.println("So dien thoai hop le");
                break;
            } else {
                System.out.println("So dien thoai khong lop le. Moi nhap lai theo cu phap \\d{9,10}");
            }
        } while (true);
    }
    public void xuat(){
        System.out.println("Ho va ten sinh vien: "+hoTen);
        System.out.println("\t - Email: " +email);
        System.out.println("\t - So CMND: " +cmnd);
        System.out.println("\t - So dien thoai: "+phone);
    }
}
