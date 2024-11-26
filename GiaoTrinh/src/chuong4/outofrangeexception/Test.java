/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4.outofrangeexception;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Nhap luong: ");
            int luong = input.nextInt();
            
            if (luong < 5000000 || luong > 20000000) {
                throw new OutOfRangeException("Luong nhap vao khong nam trong pham vi cho phep!");
            }
            
            System.out.println("Luong vua nhap: " + luong);
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }   
    }
}
