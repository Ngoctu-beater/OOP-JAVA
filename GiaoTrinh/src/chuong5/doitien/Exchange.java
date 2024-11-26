/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong5.doitien;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Exchange {
    private ArrayList<Rate> rates; // Danh sách các tỷ giá

    // Constructor
    public Exchange(String[] rateArray) {
        rates = new ArrayList<>();
        for (String rateInfo : rateArray) {
            // Tách chuỗi để lấy thông tin mã tiền và tỷ giá
            String[] parts = rateInfo.split(";");
            String code1 = parts[0].trim();
            String code2 = parts[1].trim();
            double rate = Double.parseDouble(parts[2].trim());
            rates.add(new Rate(code1, code2, rate));
        }
    }

    // Phương thức convert
    public double convert(String code1, String code2, double amount) {
        for (Rate rate : rates) {
            if (rate.getCode1().equalsIgnoreCase(code1) && rate.getCode2().equalsIgnoreCase(code2)) {
                return amount * rate.getRate(); // Chuyển đổi theo tỷ giá
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy tỷ giá
    }
}
