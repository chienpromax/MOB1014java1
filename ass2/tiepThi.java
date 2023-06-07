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
public class tiepThi extends nhanVien{
    
    double doanhSo,hueHong;

    public tiepThi() {
    }

    public tiepThi(double doanhSo, double hueHong, String hoTen, String maNV, double luong) {
        super(hoTen, maNV,"tiep thi", luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    
    public void nhapTT(){
        super.nhapTT();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap luong doan so");
        doanhSo=sc.nextDouble();
        System.out.println("nhap hue hong");
        hueHong=sc.nextDouble();
    }
    
    public void xuat(){
        super.xuat();
        System.out.printf("doanh so:%f |hue hong:%f |\n",doanhSo,hueHong);
    }

    @Override
    double getThuNhap() {
        return super.getLuongCB()+doanhSo+hueHong;
    }
    
}
