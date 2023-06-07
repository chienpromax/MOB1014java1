/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author DELL
 */
public class appsanpham {

    public static void main(String[] args) {
        //bai 2
//        sanpham sp1=new sanpham(); 
//        sp1.nhap();
        sanpham sp1 = new sanpham("sp1", 100, 12);
        String ten=sp1.getTenSp();
        System.out.println("ten san pham" +ten);
        sp1.setTenSp(ten);
        sp1.xuat();
        //bai 2
//        sanpham sp2=new sanpham(); 
//        sp2.nhap();

        sanpham sp2 = new sanpham("sp2", 200);
        sp2.xuat();

    }
}
