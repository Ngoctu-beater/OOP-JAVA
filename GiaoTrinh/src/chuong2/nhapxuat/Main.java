/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.nhapxuat;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // nhập số nguyên
        System.out.print("Nhap mot so nguyen: ");
        int a = input.nextInt();
        
        // nhập số thưc
        System.out.print("Nhap mot so thuc: ");
        float b = input.nextFloat();
        
        // nhập một ký tự
        System.out.print("Nhap mot ky tu: ");
        char c = input.next().charAt(0);
        input.nextLine();
        
        // nhập một chuỗi ký tự
        System.out.print("Nhap mot chuoi ky tu: ");
        String str = input.nextLine();
        
        // in ra màn hình
        System.out.println("So nguyen vua nhap: " + a);
        System.out.println("nSo thuc vua nhap: " + b);
        System.out.println("Ky tu vua nhap: " + c);
        System.out.println("Chuoi vua nhap: " + str);
    }
}
