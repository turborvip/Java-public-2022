/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author IT Supporter
 */
public class main {
    public static void main(String[] args) {
        System.out.printf("%-20s%-20s%-20s%-20s\n","Ma sinh vien","Tuoi","Khoa","Nganh");

        Student a = new Student(20,16,"Cong nghe thong tin");
        a.output();
        Student b = new Student(20,16,"Cong nghe thong tin");
        b.output();
        Student c = new Student(20,16,"Cong nghe thong tin");
        c.output();
      
    }
}
