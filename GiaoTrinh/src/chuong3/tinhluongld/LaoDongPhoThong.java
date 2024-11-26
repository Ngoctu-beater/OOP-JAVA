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
public class LaoDongPhoThong extends NguoiLaoDong{
    private int soNC;        // số ngày công
    private double donGia;   // đơn giá ngày công

    // hàm tạo không đối
    public LaoDongPhoThong() {
        super();
    }

    // hàm tạo đầy đủ đối
    public LaoDongPhoThong(int soNC, double donGia, String hoTen, String diaChi, String loaiLD) {
        super(hoTen, diaChi, loaiLD);
        this.soNC = soNC;
        this.donGia = donGia;
    }

    // getter và setter
    public int getSoNC() {
        return soNC;
    }

    public void setSoNC(int soNC) {
        this.soNC = soNC;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    private static Scanner input = new Scanner(System.in);

    // nhập thông tin LĐPT
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap so ngay cong: ");
        soNC = input.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = input.nextDouble();
    }
    
    // tính lương LĐPT
    @Override
    public double tinhLuong() {
        double luongThang = soNC * donGia;
        if (15 < soNC && soNC < 25) {
            luongThang += 700000;
        }
        if (soNC >= 25) {
            luongThang += 1000000;
        }
        return luongThang;
    }

    // in thông tin LĐPT
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15f\n", tinhLuong());
    }
}
