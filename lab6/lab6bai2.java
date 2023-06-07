/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author DELL
 */
public class lab6bai2 {
    String tenSP;
    double gia;
    String hang;

    public lab6bai2() {
    }

    public lab6bai2(String tenSP, double gia, String hang) {
        this.tenSP = tenSP;
        this.gia = gia;
        this.hang = hang;
    }
    
    @Override
    public String toString(){
        return tenSP+", "+gia+", "+hang;
    }
    
    
}
