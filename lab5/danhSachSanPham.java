/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class danhSachSanPham {

    private ArrayList<sanPham> ds = new ArrayList<>();

    public void nhap() {
        System.out.println("hay nhap vao danh sach");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("hay nhap vao ten san pham ");
            String st = sc.nextLine();
            if (st.isEmpty()) {
                break;
            }
            System.out.println("gia san pham: ");
            double gia = sc.nextDouble();

            ds.add(new sanPham(st, gia));
            sc.nextLine();
        } while (true);
    }

    public void xuat() {
        System.out.println("danh sach san pham");
        System.out.println("tenSP giaSP");
        for (sanPham sanPham : ds) {
            System.out.printf("%s  |  %f\n", sanPham.getTenSp(), sanPham.getGiaSp());

        }
    }

    public void sapXep() {
        Collections.sort(ds, (a, b) -> (int) (a.getGiaSp() - b.hashCode()));
        System.out.println("danh sach sau khi sap xep");
        xuat();
    }

    public void timKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap ten san pham can tim va xoa");
        String ten = sc.nextLine();
        sanPham found=null;
        for (sanPham sanPham : ds) {
            if (sanPham.getTenSp().equals(ten)){
                found=sanPham;
                break;       
                 }
            }
        if (found != null){
            ds.remove(found);
            System.out.println("san pham da dươc xoa khoi danh sach");
          }else{
            System.out.println("san pham khong co trong danh sach");
        }
      }
    public void tinhGiaTrungBinh(){
        double tb=0,sum=0;
        for (sanPham sanPham : ds) {
            sum += sanPham.getGiaSp();   
        }
        tb=sum/ds.size();
        System.out.println("gia trung binh cac san pham: "+tb);
    }
    public void menu(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=============menu==============");
            System.out.println("1. xuat danh sach san pham:");
            System.out.println("2. xuat danh sach giam dan:");
            System.out.println("3. xap xep danh sach giam dan:");
            System.out.println("4. tim xoa san pham theo ten:");
            System.out.println("5. tinh Gia Trung Binh:");
            System.out.println("0. thoat:");
            System.out.println("moi ban chon chuc nang:");
            System.out.println("===============================");
            int chon = 0;
            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println("nhap so nguyen to 0 den 5");
                continue;
            }
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    tinhGiaTrungBinh();
                    break;
                case 0:
                    System.out.println("byeeeee");
                    System.exit(0);
                default:
                    System.err.println("hay chon chuc nang tu 0 den 5");
            }

        }
    }
    }
    

