/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.tinhluonggv;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        GVCoHuu gv1 = new GVCoHuu();
        gv1.nhapThongTin();
        
        GVThinhGiang gv2 = new GVThinhGiang();
        gv2.nhapThongTin();
        
        System.out.printf("%-15s %-15s %-15s %-10s\n", "Ho ten", "Dia chi", "Loai GV", "Luong thang");
        System.out.println("--------------------------------------------------------------");
        
        gv1.inThongTin();
        gv2.inThongTin();
    }
}
