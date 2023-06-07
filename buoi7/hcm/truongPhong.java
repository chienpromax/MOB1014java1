/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7.hcm;

import buoi7.ho.nhanVien;

/**
 *
 * @author DELL
 */
public class truongPhong {
    public class TruongPhong extends  nhanVien{

    public double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(double trachNhiem, String hoTen, double luong) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public void xuat() {
        // Mã ở đây có thể sử dụng những tài sản nào của lớp cha
//        System.out.println(super.hoTen);
//        System.out.println(super.luong);
        super.xuat();
//        System.out.println(super.thueThuNhap());
        System.out.println(trachNhiem);
    }
}
}

