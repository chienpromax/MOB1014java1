/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class sanpham {

    private String tenSp;
    private double donGia;
    private double giamGia;
     double thueNhapKhau;

     
     
     //bai4 getter và setter
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
  
     
    //bai3 Bổ sung hàm dựng và đặt tả truy xuất cho các thành viên của lớp SanPham 
    public sanpham() {
    }

    public sanpham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public sanpham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten San Pham: ");
        this.tenSp = sc.nextLine();
        System.out.println("Nhap Don Gia: ");
        this.donGia = sc.nextDouble();
        System.out.println("Nhap Giam Gia: ");
        this.giamGia = sc.nextDouble();
    }

    private double getthueNhapKhau() {
        return donGia * 0.1;
    }

    public void setthueNhapKhau(double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    public void xuat() {
        System.out.println("Ten san pham: " + tenSp + " - Don gia: " + donGia + " - Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getthueNhapKhau());
    }

}
