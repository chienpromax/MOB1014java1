/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author DELL
 */
public class sanPham {
    private String ten;
    private double gia;

    public sanPham() {
        this.ten =null;
        this.gia =0;
    }

    public sanPham(String tenSp, double giaSp) {
        this.ten = tenSp;
        this.gia = giaSp;
    }

    
    
    
    public String getTenSp() {
        return ten;
    }

    public void setTenSp(String tenSp) {
        this.ten = tenSp;
    }

    public double getGiaSp() {
        return gia;
    }

    public void setGiaSp(double giaSp) {
        this.gia = gia;
    }
    
    
}
