/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong6.filetext;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static String fileName = "exp.txt";   // tạo file
    
    public static void main(String[] args) {
        // nhập 1 chuỗi ký tự
        System.out.print("Nhap chuoi ky tu: ");
        String str = input.nextLine();
        
        // nhập 1 ký tự
        System.out.print("Nhap ky tu: ");
        char c = input.next().charAt(0);
        
        // nhập 1 số nguyên
        System.out.print("Nhap so nguyen: ");
        int a = input.nextInt();
        
        // nhập 1 số thực
        System.out.print("Nhap so thuc: ");
        float b = input.nextFloat();
        
        // ghi file
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            writer.println("Chuoi ky tu: " + str); // Ghi chuỗi ký tự
            writer.println("Ky tu: " + c);        // Ghi ký tự
            writer.println("So nguyen: " + a);    // Ghi số nguyên
            writer.println("So thuc: " + b);      // Ghi số thực

            System.out.println("Da ghi du lieu vao file " + fileName);
        } catch (IOException e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        
        // đọc file và hiển thị
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Noi dung file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Hiển thị từng dòng
            }
        } catch (IOException e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
    }
}
