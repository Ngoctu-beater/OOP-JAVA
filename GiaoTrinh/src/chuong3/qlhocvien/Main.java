/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.qlhocvien;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        HocvienDH hv1 = new HocvienDH();
        hv1.nhapThongTin();
        
        HocvienLT hv2 = new HocvienLT();
        hv2.nhapThongTin();
        
        System.out.printf("%-15s %-15s %-10s %-10s %-10s\n", "Ho ten", "Dia chi", "Loai UT", "Loai CT", "Hoc phi");
        System.out.println("--------------------------------------------------------------");
        hv1.inThongTin();
        hv2.inThongTin();
    }
            
}
