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
public abstract class HocVien {
    protected String hoTen;     // họ tên
    protected String diaChi;   // địa chỉ
    protected String loaiCT;  // loại chương trình
    protected int loaiUT;    // loại ưu tiên

    // hàm tạo không tham số
    public HocVien() {
    }

    // hàm tạo đầy đủ tham số
    public HocVien(String hoTen, String diaChi, String loaiCT, int loaiUT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCT = loaiCT;
        this.loaiUT = loaiUT;
    }

    // getter và setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiCT() {
        return loaiCT;
    }

    public void setLoaiCT(String loaiCT) {
        this.loaiCT = loaiCT;
    }

    public int getLoaiUT() {
        return loaiUT;
    }

    public void setLoaiUT(int loaiUT) {
        this.loaiUT = loaiUT;
    }
    
    private static Scanner input = new Scanner(System.in);
    
    // nhập thông tin
    public void nhapThongTin() {
        System.out.print("Nhap ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Nhap loai uu tien: ");
        loaiUT = input.nextInt();
        input.nextLine();
        System.out.print("Nhap loai chuong trinh: ");
        loaiCT = input.nextLine();
    }
    
    // in thông tin
    public void inThongTin() {
        System.out.printf("%-15s %-15s %-10s %-10s", hoTen, diaChi, loaiUT, loaiCT);
    }
    
    // tính học phí
    public abstract double hocPhi();
}
