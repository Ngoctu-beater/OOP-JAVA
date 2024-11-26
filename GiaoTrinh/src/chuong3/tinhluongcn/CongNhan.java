/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.tinhluongcn;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class CongNhan {
    private String hoTen;    // họ tên
    private String diaChi;   // địa chỉ
    private String loai;     // loại công nhân

    // hàm tạo không đối
    public CongNhan() {
    }

    // hàm tạo đầy đủ đối
    public CongNhan(String hoTen, String diaChi, String loai) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loai = loai;
    }

    // getter và setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    private static Scanner sc = new Scanner(System.in);

    // phương thức nhập thông tin
    public void nhapThongTin() {
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Loai cong nhan: ");
        loai = sc.nextLine();
    }

    // phương thức tính lương
    public abstract double tinhLuong();

    // phương thức in thông tin
    public void inThongTin() {
        System.out.printf("%-15s %-15s %-15s", hoTen, diaChi, loai);
    }
}
