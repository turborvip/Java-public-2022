
package buoi1;

import java.util.Scanner;

public class Buoi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           
        
            System.out.print("Nhap thang : ");
            int a = scanner.nextInt();
 //           while(a<1 && a>12){
 //            System.out.print("Nhap lai thang :");
 //            a = scanner.nextInt();
 //           }
            System.out.print("Nhap nam : ");
            int b = scanner.nextInt();         
                 
            switch(a){
                case 2: {
                    if((b%4 == 0 && b%100 != 0) || b % 400 == 0)
                    {
                        System.out.println("Thang 2 nam "+ b +" co 28 ngay ");
                    }else{
                        System.out.println("Thang 2 nam "+ b +" co 29 ngay");
                    }
                    break;
                }
                case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : 
                case 12:{
                    System.out.println("Thang " + a + " nam " +b +  " co 31 ngay");
                    break;
                }
                case 4: case 6: case 9 : case 11 : {
                    System.out.println("Thang " + a + " nam " +b +  " co 30 ngay");
                }
                default : {
                    System.out.println("Ban nhap sai thang roi !");
                    break;
                }
            }
                        
        
           
           
           
        
    }
    
}
