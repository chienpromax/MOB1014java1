/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class appSoThuc {

    public static void main(String[] args) {
        dSSoThuc st = new dSSoThuc();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=============menu==============");
            System.out.println("1. nhap danh ");
            System.out.println("2. Xuat danh sach: ");
            System.out.println("3. tinh tong ");
            System.out.println("0. thoat:");
            System.out.println("moi ban chon chuc nang:");
            System.out.println("===============================");
            int chon = 0;
            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("nhap so nguyen tu 0 den 3");
                continue;
            }
            switch (chon) {
                case 1:
                    st.nhap();
                    break;
                case 2:
                    st.xuat();
                    break;
                case 3:
                    st.tinhTong();
                    break;
                case 0:
                    System.out.println("byeeeee");
                    System.exit(0);
                default:
                    throw new AssertionError();

            }
        }
    }
}
