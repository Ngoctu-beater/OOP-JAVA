/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong5.doitien;

/**
 *
 * @author Admin
 */
public class Rate {
    private String code1; // Mã tiền tệ thứ nhất
    private String code2; // Mã tiền tệ thứ hai
    private double rate;  // Tỷ giá

    // hàm tạo không đối
    public Rate() {
    }

    // hàm tạo đầy đủ đối
    public Rate(String code1, String code2, double rate) {
        this.code1 = code1;
        this.code2 = code2;
        this.rate = rate;
    }

    // getter và setter
    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
