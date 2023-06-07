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
public class kiemTra {
public Boolean isEmail(String str){
        String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        return str.matches(reEmail);
    }
    public Boolean isCMND(String str){
        String reCMND = "\\d{12}";
        return str.matches(reCMND);
    }
    public Boolean isSoDienThoai(String str){
        String rePhone = "0\\d{9,10}";
        return str.matches(rePhone);
    }
}

