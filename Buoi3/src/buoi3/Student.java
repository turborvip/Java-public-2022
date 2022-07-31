
package buoi3;

import java.util.Scanner;

public class Student {
    public static int maSV = 0;
    public int tuoi;
    public int khoa;
    public String nganh;
    
    public static Scanner scanner = new Scanner(System.in);
    
    public Student(int tuoi,int khoa,String nganh){
        maSV++;
        this.tuoi =tuoi;
        this.khoa = khoa;
        this.nganh = nganh;
    }
    
//   static được dùng để quản lý bộ nhớ và được tạo 1 lần duy nhất 
//   ví dụ cái đối tượng scanner kia khai báo 1 lần nhưng được dùng ở rất nhiều chỗ trong class.
//    phím tắt tạo constrator main là : m+a+i+n +tab
    
    public int getMaSV(){
        return maSV;
    }
    
    public int getTuoi(){
        return tuoi;
    }
    
    public int getKhoa(){
        return khoa;
    }
    
    public String getNganh(){
        return nganh;
    }
    
    public void setMaSV(int maSV){
        this.maSV = maSV;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }

    public void setKhoa(int khoa){
        this.khoa = khoa;
    }
    public void setNganh(String nganh){
        this.nganh = nganh;
    }
    public void input(){
        System.out.print("Nhap ma sinh vien: ");
        maSV = scanner.nextInt();
        System.out.print("Nhap tuoi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap khoa: ");
        khoa = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap nganh: ");
        nganh = scanner.nextLine();
    }
    public void output(){
        System.out.printf("%-20s%-20s%-20s%-20s\n",maSV,tuoi,khoa,nganh);
    }
    
}

