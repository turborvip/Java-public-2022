
package bai2;

import java.util.Scanner;

public class bai2 {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so nhan vien ");
        int n = scanner.nextInt();
        NhanVien a[]= new NhanVien[n];
        for(int i = 0 ; i < n ; i++){
            NhanVien k = new NhanVien();
            k.input();
            a[i] = k;
        }
        
        System.out.println("Danh sach nhan vien la : ");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","maNV","ten","tuoi","diaChi","boPhan");

        for(NhanVien k : a){
            k.output();
        }
        
    }
    
}
   