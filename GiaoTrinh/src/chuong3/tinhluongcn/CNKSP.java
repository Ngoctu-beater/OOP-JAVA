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
public class CNKSP extends CongNhan {

    private int soSP;         // số sản phẩm
    private double donGia;    // đơn giá

    // hàm tạo không đối
    public CNKSP() {
        super();
    }

    // hàm tạo đầy đủ đối
    public CNKSP(String hoTen, String diaChi, String loai, int soSP, double donGia) {
        super(hoTen, diaChi, loai);
        this.soSP = soSP;
        this.donGia = donGia;
    }

    // getter và setter
    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    private static Scanner sc = new Scanner(System.in);

    // nhập thông tin CNKSP
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap so SP: ");
        soSP = sc.nextInt();
        System.out.print("Nhap don gia SP: ");
        donGia = sc.nextDouble();
    }

    // tính lương CNKSP
    @Override
    public double tinhLuong() {
        double luongThang = soSP * donGia;
        if (1000 <= soSP && soSP < 1150) {
            luongThang += 1000000;
        }
        if (soSP >= 1150) {
            luongThang += 1500000;
        }
        return luongThang;
    }

    // in thông tin CNKSP
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15f\n", tinhLuong());
    }
}
