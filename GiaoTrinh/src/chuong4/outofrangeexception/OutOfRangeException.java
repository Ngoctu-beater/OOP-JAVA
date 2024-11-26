/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4.outofrangeexception;

/**
 *
 * @author Admin
 */
public class OutOfRangeException extends Exception {

    // hàm tạo không đối
    public OutOfRangeException() {
    }

    // hàm tạo đủ đối
    public OutOfRangeException(String message) {
        super(message);
    }
}
