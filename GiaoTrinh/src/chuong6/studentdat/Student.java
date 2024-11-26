/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong6.studentdat;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Student implements Serializable {
    private String code;     // mã sinh viên
    private String name;     // tên sinh viên
    private String dob;      // ngày, tháng, năm sinh
    private String gender;   // giới tính

    // hàm tạo không đối
    public Student() {
    }

    // hàm tạo đầy đủ đối
    public Student(String code, String name, String dob, String gender) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    // getter và setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // phương thức toString
    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", dob=" + dob + ", gender=" + gender + '}';
    }
}
