/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong5.tudien;

import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Dictionary {
    private HashMap<String, String> dictionary;

    // Constructor để khởi tạo từ điển
    public Dictionary() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "qua tao");
        dictionary.put("ball", "qua bong");
        dictionary.put("cat", "con meo");
        dictionary.put("dog", "con cho");
        dictionary.put("elephant", "con voi");
        dictionary.put("fish", "con ca");
        dictionary.put("gift", "mon qua");
        dictionary.put("home", "nha");
    }

    // Phương thức lookup để tra nghĩa của từ
    public String lookup(String word) {
        return dictionary.getOrDefault(word, null); // Trả về nghĩa nếu có, null nếu không tìm thấy
    }
}
