/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4.invaliddateexception;

/**
 *
 * @author Admin
 */
public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    // hàm tạo không đối
    public ThoiGian() {
    }

    // hàm tạo đầy đủ đối số
    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if (ngay < 1 || ngay > 31) {
            throw new InvalidDateException("Ngày không hợp lệ: " + ngay);
        }
        if (thang < 1 || thang > 12) {
            throw new InvalidDateException("Tháng không hợp lệ: " + thang);
        }
        if (nam < 0) {
            throw new InvalidDateException("Năm không hợp lệ: " + nam);
        }
        // Nếu hợp lệ, gán giá trị
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // getter và setter
    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    // Phương thức hiển thị thông tin
    public String hienThi() {
        return String.format("Ngày %d, Tháng %d, Năm %d", ngay, thang, nam);
    }
}
