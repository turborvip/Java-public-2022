/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;
//modifer: mức độ truy cập: private, protected, public, deafault

import java.util.Scanner;

class Animal{
    private String name;
    private int age;
    private String gender;
    
    public static Scanner scanner = new Scanner(System.in);

    
    public  void setName(String name){
        this.name = name;
    }
    
    public  String getName(){
        return name;
    }
    
    public  void setAge(String name){
        this.age = age;
    }
    
    public  int getAge(){
        return age;
    }
    
//    Contructer
    
    Animal(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    Animal(String a){
        name =a;
    }
    
    Animal(String a, int b){
        name = a;
        age = b;
    }
    
    public void input(){
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gender = scanner.nextLine();
    }
    
    public void output() {
        System.out.printf("%-10s%-10s%-10s\n","Name","Age","Gender");
        System.out.printf("%-10s%-10s%-10s",name,age,gender);
    }
}
public class Buoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal cat = new Animal("Tom",3,"Boy");
        cat.output();
        
    }
    
}
