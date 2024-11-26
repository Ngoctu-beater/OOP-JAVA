/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong6.studentdat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        List<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Nguyen Van A", "01/01/2000", "Nam"));
        students.add(new Student("S002", "Le Thi B", "15/05/2001", "Nu"));

        // Ghi danh sách sinh viên vào file student.dat
        String fileName = "student.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            System.out.println("Da ghi thong tin sinh vien vao file " + fileName);
        } catch (IOException e) {
            System.out.println("Co loi xay ra khi ghi file: " + e.getMessage());
        }

        // Đọc danh sách sinh viên từ file student.dat
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Student> readStudents = (List<Student>) ois.readObject();
            System.out.println("Noi dung file:");
            for (Student student : readStudents) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Co loi xay ra khi doc file: " + e.getMessage());
        }
    }
}
