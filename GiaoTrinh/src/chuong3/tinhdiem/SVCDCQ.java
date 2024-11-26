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
public class SVCDCQ extends Nguoi{
    private String maSV;    // mã sinh viên
    private double TDKT;    // tổng điểm kiểm tra
    private int SMKT;       // số môn kiểm tra
    private double DTKTHP;  // điểm thi kết thúc học phần

    // hàm tạo không đối
    public SVCDCQ() {
        super();
    }

    // hàm tạo đầy đủ đối
    public SVCDCQ(String maSV, double TDKT, int SMKT, double DTKTHP, String hoTen, String ngaySinh, String diaChi, String loaiSV) {
        super(hoTen, ngaySinh, diaChi, loaiSV);
        this.maSV = maSV;
        this.TDKT = TDKT;
        this.SMKT = SMKT;
        this.DTKTHP = DTKTHP;
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

    public double getDTKTHP() {
        return DTKTHP;
    }

    public void setDTKTHP(double DTKTHP) {
        this.DTKTHP = DTKTHP;
    }
    
    private static Scanner input = new Scanner(System.in);

    // nhập thông tin SVCDCQ
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap ma SV: ");
        maSV = input.nextLine();
        System.out.print("Nhap tong diem KT: ");
        TDKT = input.nextDouble();
        System.out.print("Nhap so mon KT: ");
        SMKT = input.nextInt();
        System.out.print("Nhap diem thi KTHP: ");
        DTKTHP = input.nextDouble();
    }

    // tính điểm SVCDCQ
    @Override
    public double tinhDiem() {
        return (TDKT/SMKT + DTKTHP) / 3;
    }
    
    // in thông tin SVCDCQ
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15f", tinhDiem());
    } 
}
