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
public class HocvienLT extends HocVien {

    private String maHV;     // mã học viên
    private String maLop;   // mã lớp
    private int soBuoi;    // số buổi học
    private double donGiaLT;   // đơn giá 

    // hàm tạo không đối
    public HocvienLT() {
        super();
    }

    // hàm tạo đầy đủ đối
    public HocvienLT(String maHV, String maLop, int soBuoi, double donGiaLT, String hoTen, String diaChi, String loaiCT, int loaiUT) {
        super(hoTen, diaChi, loaiCT, loaiUT);
        this.maHV = maHV;
        this.maLop = maLop;
        this.soBuoi = soBuoi;
        this.donGiaLT = donGiaLT;
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

    public double getDonGiaLT() {
        return donGiaLT;
    }

    public void setDonGiaLT(double donGiaLT) {
        this.donGiaLT = donGiaLT;
    }

    private static Scanner input = new Scanner(System.in);

    // nhập thông tin học viên lập trình
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
        donGiaLT = input.nextInt();
    }

    // tính học phí học viên lập trình
    @Override
    public double hocPhi() {
        int hocPhi = 0;
        if (loaiUT == 1) {
            hocPhi += soBuoi * donGiaLT - 1000000;
        } else if (loaiUT == 2) {
            hocPhi += soBuoi * donGiaLT - 800000;
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
