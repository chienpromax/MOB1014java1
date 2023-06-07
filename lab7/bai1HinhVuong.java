/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author DELL
 */
public class bai1HinhVuong extends bai1HinhChuNhat{

    public bai1HinhVuong() {
    }

    public bai1HinhVuong(double canh) {
        super(canh,canh);
    }
    @Override
    public void xuat(){
        System.out.println("canh:"+dai+"chu vi:"+getChuVi()+"dien tich:"+getDienTich()); 
   }
        
        
    
}
