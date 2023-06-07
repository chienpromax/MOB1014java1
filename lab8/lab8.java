/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author DELL
 */
public class lab8 {

    public static void main(String[] args) {

        //bai 1
//        double tong=sum(2);
//        System.out.println("tong:"+tong);
//         tong=sum(2,5,6);
//        System.out.println("tong:"+tong);
//         tong=sum(7,4,6,5);
//        System.out.println("tong:"+tong);
        //bai2
        double ketQua;
        ketQua = max(2, 8, 9);
        System.out.println("so lon:" + ketQua);
        ketQua = min(2, 5, 6);
        System.out.println("so be:" + ketQua);
        ketQua = sum(4, 5, 7, 8, 3);
        System.out.println("tong so: " + ketQua);

        //bai3
        String ten = "tran xuan chien";
        String tenMoi = toUpperFirstChar(ten);
        ten = "tran   xuan  chien";
        tenMoi = toUpperFirstChar(ten);
        System.out.println("ten viet hoa:" + tenMoi);
    }

    private static double sum(double... x) {
        double y = 0;
        for (double tong : x) {
            y += tong;
        }
        return y;
    }

    //bai 2
    private static double min(double... x) {
        double m = x[0];
        for (double tong : x) {
            m = Math.min(m, tong);
        }
        return m;
    }

    private static double max(double... x) {
        double m = x[0];
        for (double tong : x) {
            m = Math.max(m, tong);
        }
        return m;
    }

    //bai 3
    public static String toUpperFirstChar(String name) {
        String[] ars = name.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ars.length; i++) {
            String item = ars[i];
            if (!item.equals("")) {
                String ch = item.substring(0, 1).toUpperCase();
                item = ch + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
    }

}
