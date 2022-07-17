
package btvnbuoi1;

import java.util.Scanner;

public class Btvnbuoi1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Nhap thang : ");
    int month = scanner.nextInt();
    System.out.print("Nhap ngay : ");
    int day = scanner.nextInt();

    System.out.println("Ban sinh ngay "+day + " thang " + month);
    
 
}
}
