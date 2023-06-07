/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.ho;

/**
 *
 * @author DELL
 */
public class nhanVien {
    public String hoTen;
    protected double luong;

    public nhanVien() {
    }

    public nhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }
    

    public void xuat() {
        System.out.println(hoTen + ", " + luong);
    }

    private double thueThuNhap() {
        return 0;
    }

}
