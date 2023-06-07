package lab5;

import com.sun.source.tree.ContinueTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class appSinhVien {

    static ArrayList<String> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=============menu==============");
            System.out.println("1. nhap danh sach ho ten:");
            System.out.println("2. Xuat danh sach: ");
            System.out.println("3. xuat danh sach ngau nhien:");
            System.out.println("4. xap xep danh sach giam dan:");
            System.out.println("5. tim xoa ho ten:");
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
                    nhapDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    xapXepDSNgauNhien();
                    break;
                case 4:
                    xapXepDSGiamDan();
                    break;
                case 5:
                    timXoaHoTen();
                    break;
                case 0:
                    System.out.println("byeeeee");
                    System.exit(0);
                default:
                    System.err.println("hay chon chuc nang tu 0 den 5.");
            }

        }
    }

    private static void nhapDS() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("hay nhap vao danh sanh sinh vien: ");
            String ten = sc.nextLine();
            if (ten.isEmpty()){
                break;
            }
                ds.add(ten);
                System.out.println(" ");
                System.err.println("an enter de thoat");
        } while (true);
    }

    private static void xuatDS() {
        System.out.println("danh sach ho ten");
        for (String ten : ds) {
            System.out.println(ten + " ");
        }
    }

    private static void xapXepDSNgauNhien() {
        Collections.shuffle(ds);
        xuatDS();
    }

    private static void xapXepDSGiamDan() {
        Collections.sort(ds);//sx tang dan
        Collections.reverse(ds);//dao lai ds giam dan
        xuatDS();
    }

    private static void timXoaHoTen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap ten sinh vien can xoa: ");
        String hoTen = sc.nextLine();
        for (String ten : ds) {
            if (ten.equals(hoTen)) {
                ds.remove(ten);
                break;
            }
        }
        ds.add(hoTen);
    }
}
