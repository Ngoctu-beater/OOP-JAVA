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
public class Kisu extends NguoiLaoDong {

    private double luongCB;    // lương cơ bản
    private double heSo;       // hệ số lương
    private int soNC;          // số ngày công

    // hàm tạo không đối
    public Kisu() {
        super();
    }

    // hàm tạo đầy đủ đối
    public Kisu(double luongCB, double heSo, int soNC, String hoTen, String diaChi, String loaiLD) {
        super(hoTen, diaChi, loaiLD);
        this.luongCB = luongCB;
        this.heSo = heSo;
        this.soNC = soNC;
    }

    // getter và setter
    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    public int getSoNC() {
        return soNC;
    }

    public void setSoNC(int soNC) {
        this.soNC = soNC;
    }

    private static Scanner input = new Scanner(System.in);

    // nhập thông tin kĩ sư
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap luong CB: ");
        luongCB = input.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSo = input.nextDouble();
        System.out.print("Nhap so ngay cong: ");
        soNC = input.nextInt();
    }

    // tính lương kĩ sư
    @Override
    public double tinhLuong() {
        double luongThang = 0;
        if (soNC <= 15) {
            luongThang += luongCB * heSo + 500000;
        }
        if (15 < soNC && soNC < 25) {
            luongThang += luongCB * heSo + 1000000;
        }
        if (soNC >= 25) {
            luongThang += luongCB * heSo + 2000000;
        }
        return luongThang;
    }

    // in thông tin kĩ sư
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15f", tinhLuong());
    }
}
