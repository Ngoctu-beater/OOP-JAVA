/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.pheptoan;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // nhập 2 số nguyên
        System.out.print("Nhap so nguyen a: ");
        int a = input.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = input.nextInt();
        
        // in kết quả các phép toán
        System.out.println("Tong 2 so: " + (a + b));
        System.out.println("Hieu 2 so: " + (a - b));
        System.out.println("Tich 2 so: " + (a * b));
        System.out.println("Thuong 2 so: " + ((float)a / b));
    }
}
