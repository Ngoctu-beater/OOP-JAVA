/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4.invaliddateexception;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
        try {
            // tạo đối tượng ThoiGian hợp lệ
            ThoiGian tg1 = new ThoiGian(25, 11, 2024);
            System.out.println(tg1.hienThi());
            
            // tạo đối tượng với ngày ko hợp lệ
            ThoiGian tg2 = new ThoiGian(33, 11, 2024);
            System.out.println(tg2.hienThi());
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        
        try {
            // tạo đối tượng với tháng ko hợp lệ
            ThoiGian tg3 = new ThoiGian(25, 13, 2024);
            System.out.println(tg3.hienThi());
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        
        try {
            // tạo đối tượng với năm ko hợp lệ
            ThoiGian tg4 = new ThoiGian(25, 11, -2024);
            System.out.println(tg4.hienThi());
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
