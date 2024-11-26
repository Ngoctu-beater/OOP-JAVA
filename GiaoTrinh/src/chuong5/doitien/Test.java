/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong5.doitien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Mảng tỷ giá
        String[] MonArr = {
            "USD; VND;17000",
            "UR;USD; 1.2",
            "USD; IDN; 15789",
            "USD; EUR;0.83",
            "CAD; IDN; 16869"
        };

        // Tạo đối tượng Exchange
        Exchange exchange = new Exchange(MonArr);

        // Đọc thông tin từ người dùng
        System.out.print("Moi nhap vao ma tien te thu nhat: ");
        String code1 = scanner.nextLine().trim();

        System.out.print("Moi nhap vao ma tien te thu hai: ");
        String code2 = scanner.nextLine().trim();

        System.out.print("Moi nhap luong tien can chuyen doi: ");
        double amount = scanner.nextDouble();

        // Chuyển đổi tiền
        double result = exchange.convert(code1, code2, amount);

        // Hiển thị kết quả
        if (result != -1) {
            System.out.println("Luong tien sau khi doi: " + result);
        } else {
            System.out.println("Khong tim thay ty gia chuyen doi tu " + code1 + " sang " + code2);
        }
    }
}
