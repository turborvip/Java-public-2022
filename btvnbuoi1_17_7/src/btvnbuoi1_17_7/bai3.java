
package btvnbuoi1_17_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,result = 0 ;
        System.out.print("Nhap n = ");
        n = scanner.nextInt();
        int length = n/2;
        for(int i = 1 ; i<length ; i++){
            if(n%i == 0){
                result +=i;
            }
        }
        System.out.println("Tong cac uoc cua n = " + (result + n));
    }
}
