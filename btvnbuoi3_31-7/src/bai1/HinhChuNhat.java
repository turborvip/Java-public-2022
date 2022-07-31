
package bai1;

import java.util.Scanner;

/*turborvip*/
public class HinhChuNhat {
    public float chieudai;
    public float chieurong;
    
    public Scanner scanner = new Scanner(System.in);
    
    public void input(){
        System.out.print("Nhap chieu dai : ");
        chieudai = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Chieu rong la : ");
        chieurong = scanner.nextFloat();
        scanner.nextLine();
    }
    
    public float getChieuDai(){
        return chieudai;
    }
    
    public void setChieuDai(float chieudai){
        this.chieudai = chieudai;
    }
    
    public float getChieuRong(){
        return chieurong;
    }
    
    public void setChieuRong(float chieurong){
        this.chieurong = chieurong;
    }
    
    public void output(){
        System.out.println("Chieu rong : "+ chieurong + " Chieu dai : " + chieudai);
    }
    
    public float tinhDienTich() {
        return chieudai*chieurong;
    }
    
    public float tinhChuVi(){
        return (chieudai+chieurong)*2;
    }
    
}
