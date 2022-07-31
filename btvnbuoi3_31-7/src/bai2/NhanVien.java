
package bai2;

import java.util.Scanner;

public class NhanVien {
    public static int maNVtemp = 0;
    public int maNV;
    public int tuoi;
    public String ten;
    public String diaChi;
    public String boPhan;
    
    public static Scanner scanner = new Scanner(System.in);
    
    public void input(){
        System.out.print("Nhap ten nhan vien ");
        ten = scanner.nextLine();
        System.out.print("Nhap tuoi nhan vien ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap dia chi nhan vien ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap bo phan nhan vien ");
        boPhan = scanner.nextLine();
        maNVtemp++;
        maNV = maNVtemp;
    }
    
    public void output(){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",maNV,ten,tuoi,diaChi,boPhan);
    }
}
