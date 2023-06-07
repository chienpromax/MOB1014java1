/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanMemQLNS;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public abstract class nhanVien {

    String hoTen, maNV, loai;
    double luongCB;

    public nhanVien() {
        
    }
    public nhanVien(String hoTen, String maNV, String loai, double luong) {
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.loai = loai;
        this.luongCB = luongCB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luong) {
        this.luongCB = luongCB;
    }
    
    public void nhapTT(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma nhan vien");
        maNV=sc.nextLine();
        System.out.println("nhap ten nhan vien");
        hoTen=sc.nextLine();
        System.out.println("nhap loai nhan vien");
        loai=sc.nextLine();
        System.out.println("nhap luong nhan vien");
        luongCB=sc.nextDouble();
        }
    public void xuat(){
        System.out.printf("\nho ten:%s |maNV:%s |loai:%s |luong:%f |\n",hoTen,maNV,loai,luongCB);
    }
    
    abstract double getThuNhap();

    public double getThueThuNhap() {
        double thue=0;
        if (getThuNhap() < 9000000) {
            thue = 0;        
        } else if (getThuNhap()>=9000000 && getThuNhap() < 1500000) {
            thue = getThuNhap()*0.1;
        } else
            thue = getThuNhap()*0.12;
        return thue;       
    }
}

