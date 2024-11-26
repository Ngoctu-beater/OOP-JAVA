/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.tinhluongcn;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        CNKSP cn1 = new CNKSP();
        cn1.nhapThongTin();
        
        CNTCN cn2 = new CNTCN();
        cn2.nhapThongTin();
        
        System.out.printf("%-15s %-15s %-15s %-15s %-15s", "Ho ten", "Dia chi", "Ngay sinh", "Loai CN", "Luong thang");
        System.out.println("--------------------------------------------------------------");
        cn1.inThongTin();
        cn2.inThongTin();
    }
}
