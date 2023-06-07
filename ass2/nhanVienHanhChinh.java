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
public class nhanVienHanhChinh extends nhanVien{

    public nhanVienHanhChinh() {
    }

    public nhanVienHanhChinh(String hoTen, String maNV, String loai, double luong) {
        super(hoTen, maNV, loai, luong);
    }
 
    public void xuat(){
        super.xuat();
    }

    @Override
    double getThuNhap() {
        return super.luongCB;
    }
    
    
    
}
