/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.tinhluonggv;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GVThinhGiang extends GiangVien{
    private int soTietDay;      // số tiết dạy
    private double donGia;      // đơn giá

    // hàm tạo không đối
    public GVThinhGiang() {
        super();
    }

    // hàm tạo đầy đủ đối
    public GVThinhGiang(int soTietDay, double donGia, String hoTen, String diaChi, String loaiGV) {
        super(hoTen, diaChi, loaiGV);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    // getter và setter
    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    private static Scanner input = new Scanner(System.in);
    
    // nhập thông tin GV thỉnh giảng
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap so tiet day: ");
        soTietDay = input.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = input.nextDouble();
    }
    
    // tính lương GV thỉnh giảng
    @Override
    public double tinhLuong() {
        double luongThang = 0;
        luongThang += soTietDay * donGia - 0.15 *(soTietDay * donGia);
        return luongThang;
    }

    // in lương tháng
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-20f", tinhLuong());
    }
}
