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
public abstract class GiangVien {
    protected String hoTen;     // họ tên
    protected String diaChi;   // địa chỉ
    protected String loaiGV;  // loại giảng viên

    // hàm tạo không đối
    public GiangVien() {
    }

    // hàm tạo đầy đủ đối
    public GiangVien(String hoTen, String diaChi, String loaiGV) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGV = loaiGV;
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

    public String getLoaiGV() {
        return loaiGV;
    }

    public void setLoaiGV(String loaiGV) {
        this.loaiGV = loaiGV;
    }
    
    private static Scanner input = new Scanner(System.in);
    
    // phương thức nhập thông tin
    public void nhapThongTin() {
        System.out.print("Nhap ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Nhap loai giao vien: ");
        loaiGV = input.nextLine();
    }
    
    // phương thức tính lương
    public abstract double tinhLuong();
    
    // phương thức in thông tin
    public void inThongTin() {
        System.out.printf("%-15s %-15s %-10s", hoTen, diaChi, loaiGV);
    }
}
