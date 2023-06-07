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
public class truongPhong extends nhanVien{

    double trachNhiem;

    public truongPhong() {
    }

    public truongPhong(double trachNhiem, String hoTen, String maNV, double luong) {
        super(hoTen, maNV, "truong phong", luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap luong trac nhiem");
        trachNhiem=sc.nextDouble();
    }

   
    public void xuat(){
        super.xuat();
        System.out.printf("trach nhiem:%f \n",trachNhiem);
    }
    
    @Override
    double getThuNhap() {
        return super.getLuongCB()+ trachNhiem;
    }
    
}
