/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.security.PublicKey;

/**
 *
 * @author DELL
 */
public abstract class lab7Bai2SinhVienPoly {

    String hoTen;
    String nganh;

    public lab7Bai2SinhVienPoly() {
    }

    public lab7Bai2SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    abstract double getDiem();

    public String getHocLuc() {
        
        if (getDiem()<5) {
            return "yeu";
        } else if (getDiem() <6.5) {
            return "trung binh";
        } else if (getDiem() <7.5) {
            return "kha";
        } else if (getDiem() < 9) {
            return "gioi";
        } else {
            return "xuat sac";
        }
    }

    void xuat() {
        System.out.println("ten sinh vien:" + hoTen + ", nganh:" + nganh + ", diem:"+getDiem()+", hoc luc:"+getHocLuc());
    }

}
