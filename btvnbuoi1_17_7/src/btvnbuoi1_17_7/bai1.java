
package btvnbuoi1_17_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month,day;
        System.out.print("Nhap thang : ");
        month = scanner.nextInt();
        while(month<1 || month>12){
            System.out.print("Nhap lai thang : ");
            month = scanner.nextInt();
        }
        
        System.out.print("Nhap ngay : ");
        day = scanner.nextInt();
        while(day<1 || day>31){
            System.out.print("Nhap lai ngay : ");
            day = scanner.nextInt();
        }

        
        System.out.println("Ban sinh ngay "+day + " thang " + month);
        
        switch(month){
            case 1 -> {
                if(day>=20 && day <= 31){
                    System.out.println("Ban thuoc cung Bao Binh");
                }else{
                    System.out.println("Ban thuoc cung Ma Ket");
                }
            }
            case 2 -> {
                if(day>=19 && day<=30){
                    System.out.println("Ban thuoc cung Song Ngu");
                }else{
                    System.out.println("Ban thuoc cung Bao Binh");
                }
            }
            case 3 -> {
                if(day>=21 && day<=31){
                    System.out.println("Ban thuoc cung Bach Duong");
                }else{
                    System.out.println("Ban thuoc cung Song Ngu");
                }
            }
            case 4 -> {
                if(day>=21 && day<=30){
                    System.out.println("Ban thuoc cung Kim Nguu");
                }else{
                    System.out.println("Ban thuoc cung Bach Duong");
                }
            }
            case 5 -> {
                if(day>=21 && day<=31){
                    System.out.println("Ban thuoc cung Song Tu");
                }else{
                    System.out.println("Ban thuoc cung Kim Nguu");
                }
            }
            case 6 -> {
                if(day>=22 && day<=30){
                    System.out.println("Ban thuoc cung Cu Giai");
                }else{
                    System.out.println("Ban thuoc cung Song Tu");
                }
            }
            case 7 -> {
                if(day>22 && day<=31){
                    System.out.println("Ban thuoc cung Su Tu");
                }else{
                    System.out.println("Ban thuoc cung Cu Giai");
                }
            }
            case 8 -> {
                if(day>22 && day<=31){
                    System.out.println("Ban thuoc cung Xu Nu");
                }else{
                    System.out.println("Ban thuoc cung Su Tu");
                }
            }
            case 9 -> {
                if(day>22 && day<=30){
                    System.out.println("Ban thuoc cung Thien Binh");
                }else{
                    System.out.println("Ban thuoc cung Xu Nu");
                }
            }
            case 10 -> {
                if(day>23 && day<=31){
                    System.out.println("Ban thuoc cung Bo Cap");
                }else{
                    System.out.println("Ban thuoc cung Thien Binh");
                }
            }
            case 11 -> {
                if(day>22 && day<=30){
                    System.out.println("Ban thuoc cung Nhan Ma");
                }else{
                    System.out.println("Ban thuoc cung Bo Cap");
                }
            }
            case 12 -> {
                if(day>21 && day<=31){
                    System.out.println("Ban thuoc cung Ma Ket");
                }else{
                    System.out.println("Ban thuoc cung Nhan Ma");
                }
            }
            
            default -> {
                System.out.println("Ban nhap sai thang!");
            }
        }
    }
    
}
