package btvnbuoi3;

import java.util.Scanner;

public class bai2 {
    
    public static String removeCharAt(String string, int pos) {
      return string.substring(0, pos) + string.substring(pos + 1);
   }
    
    public static String xoaDauCachDau(String chuoi){
        String k = chuoi;
        int length = k.length();
        for(int i = 0 ; i < length ; i++){
          if(' ' == k.charAt(i)){
              k = removeCharAt(k,i);
              i--;
              length--;
          }else{
              break;
          }
        }
        return k;
    }
    
    public static String xoaDauCachCuoi(String chuoi){
        String k = chuoi;
        int length = k.length();
        for(int i = length-1 ; i >-1 ; i--){
          if(' ' == k.charAt(i)){
              k = removeCharAt(k,i);
              length--;
          }else{
              break;
          }
        }
        return k;
    }
    
    public static String xoaDauCachThua(String chuoi){
        String k = chuoi;
        k = xoaDauCachDau(k);
        k = xoaDauCachCuoi(k);
        int length = k.length();
        for(int i = 1 ; i < length ; i++){
          if(' ' == k.charAt(i) && ' ' == k.charAt(i-1)){
              k = removeCharAt(k,i);
              i--;
              length--;
          }
        }
        return k;
    }
    
    public static String vietHoaMotChuCaiTrongChuoi(String chuoi , int index){
        String k = chuoi;
        String s = k.substring(0, index);
        String tr = k.substring(index, index +1);
        tr = tr.toUpperCase();
        String ing = k.substring(index +1, k.length());
        return s+tr+ing;
    }
    
    public static String vietHoaChuCai(String chuoi){
        String k = chuoi;
        k = vietHoaMotChuCaiTrongChuoi(k,0);
        
        for(int i = 0; i<k.length();i++){
            if(' ' == k.charAt(i)){
                k = vietHoaMotChuCaiTrongChuoi(k,i+1);
            }
        }
        
        return k;
    }
    
    public static String removeNumber(String chuoi){
        String k = chuoi;
        int length = k.length();
        
        for(int i = 0 ; i <length ; i++){
            if
            (
                '0' == k.charAt(i) || '1' == k.charAt(i)|| '2' == k.charAt(i)
                || '3' == k.charAt(i)|| '4' == k.charAt(i)|| '5' == k.charAt(i)
                || '6' == k.charAt(i)|| '7' == k.charAt(i)|| '8' == k.charAt(i)
                || '9' == k.charAt(i)
 
            ){
                k = removeCharAt(k,i);
                i--;
                length--;
            }
        }
        
        return k;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi : ");
        String chuoi = scanner.nextLine();
        System.out.println("Chuoi vua nhap la: "+chuoi);
        System.out.println("Chuoi sau chuan hoa :");
        System.out.println(vietHoaChuCai(removeNumber(xoaDauCachThua(chuoi))));
    }
}
