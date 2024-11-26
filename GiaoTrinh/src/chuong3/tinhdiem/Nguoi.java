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
public abstract class Nguoi {
    protected String hoTen;     // họ tên
    protected String ngaySinh;  // ngày sinh
    protected String diaChi;    // địa chỉ
    protected String loaiSV;    // loại sinh viên

    // hàm tạo không đối
    public Nguoi() {
    }

    // hàm tạo đầy đủ đối
    public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSV) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiSV = loaiSV;
    }

    // getter và setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiSV() {
        return loaiSV;
    }

    public void setLoaiSV(String loaiSV) {
        this.loaiSV = loaiSV;
    }
    
    private static Scanner input = new Scanner(System.in);
    
    // phương thức nhập thông tin
    public void nhapThongTin() {
        System.out.print("Nhap ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Nhap loai SV: ");
        loaiSV = input.nextLine();
    }
    
    // phương thức tính điểm
    public abstract double tinhDiem();
    
    // phương thức in thông tin
    public void inThongTin() {
        System.out.printf("%-15s %-15s %-15s %-15s", hoTen, diaChi, ngaySinh, loaiSV);
    }
}
