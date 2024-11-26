/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.qlhocvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HocvienDH extends HocVien {

    private String maHV;     // mã học viên
    private String maLop;   // mã lớp
    private int soBuoi;    // số buổi học
    private double donGiaDH;   // đơn giá 

    // hàm tạo không tham số
    public HocvienDH() {
        super();
    }

    // hàm tạo đầy đủ tham số
    public HocvienDH(String maHV, String maLop, int soBuoi, double donGiaDH, String hoTen, String diaChi, String loaiCT, int loaiUT) {
        super(hoTen, diaChi, loaiCT, loaiUT);
        this.maHV = maHV;
        this.maLop = maLop;
        this.soBuoi = soBuoi;
        this.donGiaDH = donGiaDH;
    }

    // getter và setter
    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public double getDonGiaDH() {
        return donGiaDH;
    }

    public void setDonGiaDH(double donGiaDH) {
        this.donGiaDH = donGiaDH;
    }

    private static Scanner input = new Scanner(System.in);

    // nhập thông tin học viên đồ họa
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap ma HV: ");
        maHV = input.nextLine();
        System.out.print("Nhap ma lơp: ");
        maLop = input.nextLine();
        System.out.print("Nhap so buoi hoc: ");
        soBuoi = input.nextInt();
        System.out.print("Nhap don gia: ");
        donGiaDH = input.nextInt();
    }

    // tính học phí học viên đồ họa
    @Override
    public double hocPhi() {
        int hocPhi = 0;
        if (loaiUT == 1) {
            hocPhi += soBuoi * donGiaDH - 1000000;
        } else if (loaiUT == 2) {
            hocPhi += soBuoi * donGiaDH - 500000;
        }
        return hocPhi;
    }

    // in thông tin học viên
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15f\n", hocPhi());
    }
}
