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
public class GVCoHuu extends GiangVien {

    private double heSoLuong;   // hệ số lương
    private double luongCB;     // lương cơ bản
    private int thamNien;       // thâm niên

    // hàm tạo không đối
    public GVCoHuu() {
        super();
    }

    // hàm tạo đầy đủ đối
    public GVCoHuu(double heSoLuong, double luongCB, int thamNIen, String hoTen, String diaChi, String loaiGV) {
        super(hoTen, diaChi, loaiGV);
        this.heSoLuong = heSoLuong;
        this.luongCB = luongCB;
        this.thamNien = thamNIen;
    }

    // getter và setter
    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    private static Scanner input = new Scanner(System.in);

    // nhập thông tin GV cơ hữu
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap luong co ban: ");
        luongCB = input.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = input.nextDouble();
        System.out.print("Nhap tham nien: ");
        thamNien = input.nextInt();
    }

    // tính lương GV cơ hữu
    @Override
    public double tinhLuong() {
        double luongThang = luongCB * heSoLuong;
        if (thamNien >= 5) {
            luongThang += luongCB * 0.05 + (thamNien - 5) * (luongCB * 0.01); // Tăng thêm 1% lương cơ bản mỗi năm sau năm thứ 5
        }
        return luongThang;
    }

    // in lương tháng
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-20f\n", tinhLuong());
    }
}
