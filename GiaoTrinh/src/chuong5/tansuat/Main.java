/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong5.tansuat;

import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        // Mảng các chuỗi ban đầu
        String[] inputStrings = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };

        // Sử dụng HashMap để lưu số lần xuất hiện của các từ
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Xử lý từng chuỗi trong mảng
        for (String line : inputStrings) {
            // Tách chuỗi thành các từ (sử dụng dấu cách làm dấu tách)
            String[] words = line.split("\\s+");

            // Đếm tần suất xuất hiện của mỗi từ
            for (String word : words) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Hiển thị số lần xuất hiện của từng từ
        for (HashMap.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Tính tổng số từ
        int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total words: " + totalWords);
    }
}
