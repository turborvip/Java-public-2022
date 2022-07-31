
package bai1;

public class bai1 {

    public static void main(String[] args) {
        HinhChuNhat a = new HinhChuNhat();
        HinhChuNhat b = new HinhChuNhat();
        System.out.println("Nhap hinh chu nhat thu nhat : ");
        a.input();
        System.out.println("Nhap hinh chu nhat thu hai : ");
        b.input();
        System.out.println("Thong tin lan luot hai hinh chu nhat la : ");
        a.output();
        b.output();
        float m = a.tinhDienTich();
        float n = b.tinhDienTich();
        
        if(m==n){
            System.out.println("Hai hinh chu nhat co dien tich bang nhau!");
        }else if(m>n){
            System.out.println("Hinh chu nhat co dien tich lon hon la : ");
            a.output();
        }else{
            System.out.println("Hinh chu nhat co dien tich lon hon la : ");
            b.output();
        }
    }
    
}
   