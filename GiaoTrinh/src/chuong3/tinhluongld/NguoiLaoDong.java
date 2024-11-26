/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.tinhluongld;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class NguoiLaoDong {

    protected String hoTen;   // họ tên
    protected String diaChi;  // địa chỉ
    protected String loaiLD;  // loại lao động

    // hàm tạo không đối
    public NguoiLaoDong() {
    }

    // hàm tạo đầy đủ đối
    public NguoiLaoDong(String hoTen, String diaChi, String loaiLD) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLD = loaiLD;
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

    public String getLoaiLD() {
        return loaiLD;
    }

    public void setLoaiLD(String loaiLD) {
        this.loaiLD = loaiLD;
    }

    private static Scanner input = new Scanner(System.in);

    // phương thức nhập thông tin
    public void nhapThongTin() {
        System.out.print("Nhap ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Nhap loai lao dong: ");
        loaiLD = input.nextLine();
    }

    // phương thức tính lương
    public abstract double tinhLuong();
    
    // phương thức in thông tin;
    public void inThongTin() {
        System.out.printf("%-15s %-15s %-10s", hoTen, diaChi, loaiLD);
    }
}
