/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.mang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // nhập số ptu mảng
        System.out.print("Nhap so ptu mang: ");
        int n = input.nextInt();
        
        // khởi tạo mảng n ptu
        float a[] = new float[n];
        
        // nhập các ptu
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = input.nextFloat();
        }
        
        // in mảng vừa nhập
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        // tổng các ptu
        float tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        System.out.println("\nTong cac ptu la: " + tong);
    }
}
