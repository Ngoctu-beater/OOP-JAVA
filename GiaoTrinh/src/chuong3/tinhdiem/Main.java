/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.tinhdiem;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SVCDN sv1 = new SVCDN();
        sv1.nhapThongTin();
        
        SVCDCQ sv2 = new SVCDCQ();
        sv2.nhapThongTin();
        
        System.out.printf("%-15s %-15s %-15s %-15s %-15s", "Ho ten", "Dia chi", "Ngay sinh", "Loai SV", "Diem TB");
        System.out.println("--------------------------------------------------------------");
        sv1.inThongTin();
        sv2.inThongTin();
    }
}
