/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author DELL
 */
public class bai1HinhChuNhat {
    double rong;
    double dai;

    public bai1HinhChuNhat() {
    }

    public bai1HinhChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }
    
    double getChuVi(){
       return (dai+rong)*2;
    }
    double getDienTich(){
       
        return dai*rong;
   }
    public void xuat(){
        System.out.println("chieu dai:"+dai+"rong:"+rong+"chu vi:"+getChuVi()+"dien tich"+getDienTich());
        
    }
}
