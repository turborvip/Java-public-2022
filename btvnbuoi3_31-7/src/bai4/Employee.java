
package bai4;

import java.util.Scanner;

public class Employee {
    public String id;
    public String name;
    public int age;
    public int workingDays;    
    final int PRICE = 50;
    public double salary;
    public static Scanner scanner = new Scanner(System.in);

    
    public Employee(String id,String name,int age,int workingDays){
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }
    
    public Employee(){}
    
    public String getID(){
        return id;
    }
    
    public void setID(String a){
        id = a;
    }
    public String getName(){
        return name;
    }
    
    public void setName(String a){
        name = a;
    }
    public int getAge(){
        return age;
    }
    
    public void setAge(int a){
        age = a;
    }
    public int getWorkingDays(){
        return workingDays;
    }
    
    public void setWorkingDays(int a){
        workingDays = a;
    }
    
    public double getSalary(){
        return workingDays*PRICE;
    }
    
    public void input(){
        System.out.print("Nhap id nhan vien : ");
        id = scanner.nextLine();
        System.out.print("Nhap ten nhan vien : ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi nhan vien : ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ngay lam viec nhan vien : ");
        workingDays = scanner.nextInt();
        scanner.nextLine();
    }
    
    public void output(){
//        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","id","ten","tuoi","ngay lam viec","luong");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",id,name,age,workingDays,getSalary());
    }
}
