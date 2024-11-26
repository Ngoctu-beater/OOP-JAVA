/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4.invaliddateexception;

/**
 *
 * @author Admin
 */
public class InvalidDateException extends Exception {

    // hàm tạo không đối
    public InvalidDateException() {
    }

    // hàm tạo đủ đối
    public InvalidDateException(String message) {
        super(message);
    }
}
