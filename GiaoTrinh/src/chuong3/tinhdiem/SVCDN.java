/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3.tinhdiem;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SVCDN extends Nguoi {
    private String maSV;    // mã sinh viên
    private double TDKT;    // tổng điểm kiểm tra
    private int SMKT;       // số môn kiểm tra

    // hàm tạo không đối
    public SVCDN() {
        super();
    }

    // hàm tạo đầy đủ đối
    public SVCDN(String maSV, double TDKT, int SMKT, String hoTen, String ngaySinh, String diaChi, String loaiSV) {
        super(hoTen, ngaySinh, diaChi, loaiSV);
        this.maSV = maSV;
        this.TDKT = TDKT;
        this.SMKT = SMKT;
    }

    // getter và setter
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getTDKT() {
        return TDKT;
    }

    public void setTDKT(double TDKT) {
        this.TDKT = TDKT;
    }

    public int getSMKT() {
        return SMKT;
    }

    public void setSMKT(int SMKT) {
        this.SMKT = SMKT;
    }

    private static Scanner input = new Scanner(System.in);

    // nhập thông tin SVCĐN
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap ma SV: ");
        maSV = input.nextLine();
        System.out.print("Nhap tong diem KT: ");
        TDKT = input.nextDouble();
        System.out.print("Nhap so mon KT: ");
        SMKT = input.nextInt();
    }

    // tính điểm SVCĐN
    @Override
    public double tinhDiem() {
        return TDKT / SMKT;
    }

    // in thông tin SVCDN
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15f\n", tinhDiem());
    }  
}
