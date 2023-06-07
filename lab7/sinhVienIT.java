/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author DELL
 */
public class sinhVienIT extends lab7Bai2SinhVienPoly {

    double diemJava;
    double diemHTML;
    double diemCss;

    public sinhVienIT() {
    }
    
   
    public sinhVienIT(double diemJava, double diemHTML, double diemCss, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCss = diemCss;
    }

    @Override
    double getDiem() {
        return (2 * diemJava + diemHTML + diemCss) / 4;
    }
    @Override
    void xuat(){
        super.xuat();
        System.out.println("java: "+diemJava+", HTML"+diemHTML+", Css:"+diemCss);
    }

}
