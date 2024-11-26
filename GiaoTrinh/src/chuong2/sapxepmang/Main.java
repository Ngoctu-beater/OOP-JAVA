/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong2.sapxepmang;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // nhập số lượng sinh viên
        System.out.print("Nhap so luong sv: ");
        int n = input.nextInt();

        // mảng chứa điểm sv
        int[] scores = new int[n];

        // Nhập điểm cho từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap diem sv " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // Tìm điểm cao nhất và sinh viên có điểm cao nhất
        int maxScore = scores[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }

        // Sắp xếp mảng điểm theo thứ tự tăng dần
        Arrays.sort(scores);

        // In ra kết quả
        System.out.println("Diem cao nhat: " + maxScore);
        System.out.println("Sinh vien co diem cao nhat: Sinh vien thu " + (maxIndex + 1));
        System.out.println("Diem tat ca sv theo chieu tang dan: " + Arrays.toString(scores));

        // Nhập một điểm bất kỳ từ bàn phím
        System.out.print("Nhap diem can tim: ");
        int searchScore = input.nextInt();
        boolean found = false;

        // Tìm sinh viên có điểm bằng với điểm vừa nhập
        for (int i = 0; i < n; i++) {
            if (scores[i] == searchScore) {
                System.out.println("Sinh vien thu " + (i + 1) + " co diem bang " + searchScore);
                found = true;
            }
        }

        // Nếu không tìm thấy sinh viên có điểm bằng điểm nhập vào
        if (!found) {
            System.out.println("Khong co sv co diem bang " + searchScore);
        }
    }
}
