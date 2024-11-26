/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4.stringtoolongexception;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) { 
        String input;

        System.out.println("Nhap cac chuoi ky tu (nhap 'DONE' de ket thuc):");

        while (true) {
            input = scanner.nextLine();

            // Kiểm tra nếu chuỗi là "DONE" thì kết thúc
            if (input.equalsIgnoreCase("DONE")) {
                System.out.println("Chuong trinh ket thuc!");
                break;
            }

            try {
                // Kiểm tra chuỗi có vượt quá 30 ký tự không
                if (input.length() > 30) {
                    throw new StringTooLongExecption("Loi: Chuoi nhap vao nhieu hon 30 ky tu!");
                }

                // Nếu không vượt quá, in ra chuỗi nhập vào
                System.out.println("Chuoi vua nhap: " + input);

            } catch (StringTooLongExecption e) {
                // Xử lý ngoại lệ và thông báo lỗi
                System.out.println(e.getMessage());
                System.out.println("Chuong trinh ket thuc do chuoi qua dai!");
                break;
            }
        }
    }
}
