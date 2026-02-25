package Cau1;

import java.util.Arrays;
import java.util.Scanner;

//Cau 1 -  Phan 1: Chuan hoa chuoi
public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhap chuoi
        System.out.print("Nhap vao 1 chuoi: ");
        String str = sc.nextLine();
        String[] newStr = str.trim().split(""); // cat chuoi thanh mang
        newStr[0] = newStr[0].toUpperCase();
        for(int i = 0; i < newStr.length; i++){
            if(newStr[i].equals(" ")){
                newStr[i + 1] = newStr[i + 1].toUpperCase();
            }
        }
        for(int i = 0; i < newStr.length; i++){
            System.out.printf("%s", newStr[i]);
        }
    }
}
