
package bai3;

import java.util.Scanner;

public class PTBac2 {
    float a,b,c;
    public static Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.print("a = ");
        a = scanner.nextFloat();
        System.out.print("b = ");
        b = scanner.nextFloat();
        System.out.print("c = ");
        c = scanner.nextFloat();
    }
    
    public void output(){
        System.out.println("Phuong trinh co dang : ");
        System.out.println(a+"x^2 + "+b+"x + "+c +" = 0");
    }
    
    public void giai(){
        if(a==0){
            System.out.println("Phuong trinh la phuong trinh bac nhat :");
            System.out.println("Phuong trinh co nghiem duy nhat "+(-c/b));
        }else{
            float dental = b*b - 4*a*c;
            
            if(dental<0){
                System.out.println("Phuong trinh vo nghiem! ");
            }else if(dental == 0){
                System.out.println("Phuong trinh co nghiem kep :");
                System.out.println("x1 = x2 = "+(-b/(2*a)));
            }else{
                System.out.println("Phuong trinh co 2 nghiem phan biet : ");
                System.out.printf("%-5s%-10s%-5s%-10s",
                        "x1 = ",
                        ((-b - Math.sqrt(dental))/2*a)
                        ,"x2 = ",
                        ((-b + Math.sqrt(dental))/2*a)
                );
            }
        }
    }
}
