package btvnbuoi3;

import java.util.Scanner;

public class bai1 {
    
    public static void nhap(int [] a){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < a.length ; i++){
            System.out.print("a["+i+"] = ");
            a[i] = scanner.nextInt();
        }
            
    }
    
    public static void xuat(int[] a){
        for(int i : a)
            System.out.print(i + " ");
    }
    
    public static void tbcSoLeViTriChan(int [] a){
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(i%2 == 0 && a[i]%2 !=0){
                ++count;
                sum+=a[i];
            }
        }
        System.out.println("Trung binh cong cac so le o vi tri chan la : "+ (float)(sum/count));
    }
    
    public static void soChinhPhuong(int [] a){
        int dem = 0;
        for(int i = 0;i < a.length ; i++){
            if(ktraChinhPhuong(a[i])){
                System.out.print(a[i]+" " );
                ++dem;
            }
        }
        if(dem == 0)
            System.out.println("Khong co so chinh phuong !");
    }
    
    public static boolean ktraChinhPhuong(int k){
        return (double) Math.sqrt(k) - (int) Math.sqrt(k)== 0;
    }
    
    public static void soNguyenTo(int [] a){
        for(int i = 0 ; i< a.length ; i++){
            if(ktraSoNguyenTo(a[i]))
                System.out.print(a[i]+" ");
        }
    }
    
    public static boolean ktraSoNguyenTo(int k){
        for(int i = 2 ; i*i<=k ;i++){
            if(k%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void sort(int [] a){
        for(int i= 0 ; i< a.length -1 ; i++){
            for(int j = i+1; j<a.length ; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        xuat(a);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang : ");
        int n = scanner.nextInt();
        int [] a = new int [n];
        nhap(a);
        
        
        
        System.out.println("-------------------");
        System.out.println("1. Xuat mang vua nhap : ");
        System.out.println("2. Trung binh cong cac so le o vi tri chan :");
        System.out.println("3. Kiem tra so chinh phuong :");
        System.out.println("4. Hien thi so nguyen to: ");
        System.out.println("5. Sap xep tang dan: ");
        
        System.out.print("Nhap lua chon : ");
        int choose = scanner.nextInt();
        
        while(choose>5 || choose<1){
            System.out.print("Nhap lai lua chon : ");
            choose = scanner.nextInt();
        }
        switch(choose){
            case 1:{
                xuat(a);
                break;
            }
            case 2: {
                tbcSoLeViTriChan(a);
                break;
            }
            case 3: {
                soChinhPhuong(a);
                break;
            }
            case 4: {
                soNguyenTo(a);
                break;
            }
            case 5: {
                System.out.println("Mang ban dau :");
                xuat(a);
                System.out.println("\nSau khi sap xep :");
                sort(a);
                break;
            }
            default:{
                System.out.println("Ban nhap lua chon sai !");
            }
        }
    }
}
