/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.menu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // nhập 2 số thuc
        System.out.print("Nhap so thuc a: ");
        float a = input.nextFloat();
        System.out.print("Nhap so thuc b: ");
        float b = input.nextFloat();

        System.out.println("------------------------");
        System.out.println("A. Tinh tong 2 so");
        System.out.println("S. Tinh hieu 2 so");
        System.out.println("M. Tinh tich 2 so");
        System.out.println("D. Tinh thuong 2 so");
        System.out.println("------------------------");

        boolean check = false;

        while (!check) {
            // nhập ký tự
            System.out.print("Nhap ky tu: ");
            char c = input.next().charAt(0);
            
            switch (c) {
                case 'A':
                    System.out.println("Tong 2 so: " + (a + b));
                    check = true;
                    break;
                case 'S':
                    System.out.println("Hieu 2 so: " + (a - b));
                    check = true;
                    break;
                case 'M':
                    System.out.println("Tich 2 so: " + (a * b));
                    check = true;
                    break;
                case 'D':
                    System.out.println("Thuong 2 so: " + (a / b));
                    check = true;
                    break;
                default:
                    System.out.println("Ky tu khong hop le!");
                    break;
            }
        }
    }
}
