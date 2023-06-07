/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author DELL
 */
public class sinhVienBiz extends lab7Bai2SinhVienPoly{
    double mkt;
    double diemSale;

    public sinhVienBiz() {
    }
    
    

    public sinhVienBiz(double mkt, double diemSale, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.mkt = mkt;
        this.diemSale = diemSale;
    }
    
    @Override
    double getDiem(){
        return (2*mkt+diemSale)/3;
    }
    @Override
    void xuat(){
        super.xuat();
        System.out.println("maketing "+mkt+", sale"+diemSale);
    }

}
