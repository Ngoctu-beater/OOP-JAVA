/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong6.filedat;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    private static Scanner input = new Scanner(System.in);
    public static String fileName = "exp.dat";   // tạo file

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
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject("Chuoi ky tu: " + str); // Ghi chuỗi ký tự
            oos.writeObject("Ky tu: " + c);         // Ghi ký tự
            oos.writeObject("So nguyen: " + a);     // Ghi số nguyên
            oos.writeObject("So thuc: " + b);       // Ghi số thực

            System.out.println("Da ghi du lieu vao file " + fileName);
        } catch (IOException e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }

        // đọc file và hiển thị
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            System.out.println("Noi dung file:");
            while (true) {
                try {
                    // Đọc đối tượng
                    String line = (String) ois.readObject();
                    System.out.println(line); // Hiển thị từng dòng
                } catch (EOFException e) {
                    // Kết thúc file
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Co loi xay ra khi doc file: " + e.getMessage());
        }
    }
}
