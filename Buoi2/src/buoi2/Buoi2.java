/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;

import java.util.Scanner;

/**
 *
 * @author IT Supporter
 */
public class Buoi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào chuỗi bất kỳ: ");
	String chuoi;
        chuoi = scanner.nextLine();
        
        System.out.println(chuoi);
        //chuoi.length(); // tra ve so luong ki tu cua mang 
        //chuoi.chatAt(i); tra ve ki tự lại vị trí i
        //chuoi.concat(chuoi) noi 2 chuoi voi nhau          
        //substring (int index, int length) lay ra chuoi con exp: chuoi = chuoi.substring(1,4); co nghia la no se lay tu vi tri 1 den 4
        //toLowerCase(Locale.ROOT) viet thuong 1 chuoi
        //toUpperCase(Locale.ROOT) viet hoa 1 chuoi 
        //compareTo()exp s1.compareTo(s2) dựa theo mã ascii so sánh 2 chuỗi trả về 3 giá trị 
        //nếu = 0 thì 2 chuỗi giống hệt nhau (có phân biệt chữ hoa và chữ thường theo bảng mã ascii)
        //nếu < 0 thì chuỗi 1 < chuỗi 2 (vd a<b vì trong bảng ascii b sau a)
        //ngược lại tương tự
        
        System.out.print("Nhap so phan tu cua mang : ");
        int n = scanner.nextInt();
        int [] a = new int [n];
        nhap(a);
        xuat(a);
        System.out.println(" ");
        System.out.print("So nguyen to trong mang la : ");
        
        
        for(int i : a){
            if(SoNguyenTo(i)){
                System.out.print(i + "");
            }
        }
        System.out.println("\nMang duoc sap xep tu lon den be");
        Sort(a);
        xuat(a);
        
        System.out.println("\nThem phan tu ");
        xuat(Insert(a,99,2));
        System.out.println("\nXoa phan tu ");
        xuat(Remove(a,2));
        
    }
    
    public static void nhap (int a[]) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < a.length ;i++){
            System.out.print("a["+i+"]= ");
            a[i] = scanner.nextInt();
        }
    }
    
    public static boolean SoNguyenTo (int n) {
        if(n>1){
            for(int i = 2 ; i*i <= n ; i++)
                if(n%i == 0)
                    return false;
        }else{
            return false;
        }
        return true;
    }
    
    public static void xuat (int a[]) {
        for(int i : a)
            System.out.print(i + " ");
        
    }
    
    public static int[] Insert(int a[],int value,int pos){
        int length = a.length + 1;
        int[] newArr = new int [a.length + 1];
        for(int i = 0 ; i< pos-1 ; i++)
            newArr[i] = a[i];
        
        a[pos-2] = value;
        
        for(int i = pos-1 ; i < length ; i++)
            newArr[i] = a[i-1];
        
        return newArr;
    }
    
    public static int[] Remove(int a[], int pos){
        int length = a.length - 1 ;
        int[] newArr = new int [length];
        for(int i = 0 ; i< pos-1 ; i++)
            newArr[i] = a[i];
        
        for(int i = pos-1 ; i< length ; i++)
            newArr[i] = a[i+1];

        return newArr;
    }
    
    public static void Sort(int a[]){
        for(int i = 0 ; i < a.length-1 ; i++)
            for(int j = i+ 1 ; j <a.length ; j++)
                if(a[j]>a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
    }
            
    
}
