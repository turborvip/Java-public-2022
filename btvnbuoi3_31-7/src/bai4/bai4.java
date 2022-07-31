package bai4;

import java.util.Scanner;

public class bai4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhap so nhan vien ");
        int n = scanner.nextInt();
        Employee a[]= new Employee[n];
        for(int i = 0 ; i < n ; i++){
            Employee k = new Employee();
            k.input();
            a[i] = k;
        }
        
        System.out.println("Danh sach nhan vien la : ");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","id","ten","tuoi","ngay lam viec","luong");
        for(Employee k : a){
            k.output();
        }
    }
}
