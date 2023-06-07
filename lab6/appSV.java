/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class appSV {
        public static void main(String[] args) {
            ArrayList<SinhVienBai3> listSV = new ArrayList<>();

            for(int i=0;i<5;i++){
                SinhVienBai3 sv = new SinhVienBai3();
                sv.nhap();
                listSV.add(sv);
            }
            for(SinhVienBai3 sv : listSV){
                sv.xuat();
            }
    }
}
