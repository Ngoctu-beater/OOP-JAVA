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
public class CNTCN extends CongNhan {
    private double luongCB;    // lương cơ bản
    private double heSo;       // hệ số lương
    private int soNC;          // số ngày công

    // hàm tạo không đối
    public CNTCN() {
        super();
    }

    // hàm tạo đầy đủ đối
    public CNTCN(double luongCB, double heSo, int soNC, String hoTen, String diaChi, String loai) {
        super(hoTen, diaChi, loai);
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
    
    private static Scanner sc = new Scanner(System.in);

    // nhập thông tin CNTCN
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap luong CB: ");
        luongCB = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSo = sc.nextDouble();
        System.out.print("Nhap so ngay cong: ");
        soNC = sc.nextInt();
    }
    

    // tính lương CNTCN
    @Override
    public double tinhLuong() {
        double luongThang = luongCB * heSo;
        if (soNC >= 20) {
            luongThang += 1.2 * luongCB;
        }
        return luongThang;
    }

    // in thông tin CNTCN
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15f", tinhLuong());
    }
}
