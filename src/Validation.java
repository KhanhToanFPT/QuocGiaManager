
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Validation {
    static Scanner sc = new Scanner(System.in);
    
    // Hàm nhập chuỗi với kiểm tra regex
    public String inputString(String msg, String regex) {
        System.out.println(msg);
        while (true) {
            String input = sc.nextLine().trim();
            if (input.matches(regex)) {
                return input;
            } else {
                System.err.println("Try again !");
            }
        }
    }

    // Hàm nhập số thực với kiểm tra regex
    public float inputFloat(String msg, String regex) {
        System.out.println(msg);
        while (true) {
            String input = sc.nextLine().trim();
            if (input.matches(regex)) {
                return Float.parseFloat(input);  // Trả về giá trị số thực sau khi kiểm tra regex
            } else {
                System.err.println("Try again! Please enter a valid float number.");
            }
        }
    }

    // Hàm menu để chọn các tùy chọn
    public int menu(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine().trim());  // Đọc chuỗi và chuyển thành số nguyên
                return number;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    
}
