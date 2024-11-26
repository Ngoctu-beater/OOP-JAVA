/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.tinhluongld;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        LaoDongPhoThong ld1 = new LaoDongPhoThong();
        ld1.nhapThongTin();
        
        Kisu ld2 = new Kisu();
        ld2.nhapThongTin();

        System.out.printf("%-15s %-15s %-15s %-10s\n", "Ho ten", "Dia chi", "Loai LD", "Luong thang");
        System.out.println("--------------------------------------------------------------");
        
        ld1.inThongTin();
        ld2.inThongTin();
    }
}
