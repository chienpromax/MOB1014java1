package lab3;

import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("hay nhap diem cua sinh vien");
//        double diem=sc.nextDouble();
//        while (diem<0||diem>10) {
//            System.out.println("hay nhap diem cua sinh vien");
//            diem=sc.nextDouble();
//        }
//        System.out.println("diem cau ban la "+diem); 

        double diem;
        do {
            System.out.println("hay nhap diem cua sinh vien");
            diem = sc.nextDouble();
        } while (diem < 0 || diem > 10);
        System.out.println("diem cau ban la " + diem);

    }
}
