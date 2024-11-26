/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4.stringtoolongexception;

/**
 *
 * @author Admin
 */
public class StringTooLongExecption extends Exception{
    // hàm tạo không đối
    public StringTooLongExecption() {
    }
    
    // hàm tạo đầy đủ đối
    public StringTooLongExecption(String message) {
        super(message);
    }
}
