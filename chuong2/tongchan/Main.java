/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.tongchan;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        // khai báo biến
        int tong = 0;
        
        // tính tổng các số chắn [1, 100]
        for (int i = 2; i <= 100; i += 2) {
                tong += i;
        }
        
        System.out.println("Tong la: " + tong);
    }
}
