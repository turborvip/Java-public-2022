/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvnbuoi1_17_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c;
        System.out.print("Nhap canh thu nhat a = ");
        a = scanner.nextInt();
        while(a<0){
            System.out.print("Nhap lai canh thu nhat a = ");
            a = scanner.nextInt();
        }
        System.out.print("Nhap canh thu nhat b = ");
        b = scanner.nextInt();
        while(b<0){
            System.out.print("Nhap lai canh thu hai b = ");
            b = scanner.nextInt();
        }
        System.out.print("Nhap canh thu nhat c = ");
        c = scanner.nextInt();
        while(c<0){
            System.out.print("Nhap lai canh thu ba c = ");
            c = scanner.nextInt();
        }
        
        boolean vuong = (a*a + b*b == c*c) || (c*c + b*b == a*a) || (c*c + a*a == b*b);
        
        if((a+b > c)&&(b+c>a)&&(c+a>b)){
            if(a==b&&b==c){
                System.out.println("Tam giac deu");
            }else if(a==b || b==c || c==a){
                if(vuong){
                    System.out.println("Tam giac vuong can");
                }else{
                    System.out.println("Tam giac can");
                }
            }else{
                if(vuong){
                    System.out.println("Tam giac vuong");
                }else{
                    System.out.println("Tam giac thuong");
                }
            }
        }
       
        
        
    }
    
}
