/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong5.tudien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        while (true) {
            // Yêu cầu người dùng nhập từ cần tra
            System.out.print("Moi nhap tu can tra: ");
            String word = input.nextLine().trim();

            // Thoát nếu người dùng nhập chuỗi rỗng
            if (word.isEmpty()) {
                System.out.println("Ket thuc chuong trinh!");
                break;
            }

            // Tìm nghĩa của từ
            String meaning = dictionary.lookup(word);

            // Hiển thị kết quả
            if (meaning != null) {
                System.out.println("Nghia cua tu la: " + meaning);
            } else {
                System.out.println("Nghia cua tu la: khong tim thay!");
            }
        }
    }
}
