package Cau1;

import java.util.Scanner;

//Cau 1 -  Phan 2: Kiem tra chuoi co phai email hop le
public class Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi: ");
        String str = sc.nextLine();
        String[] newStr = str.trim().split("");
        int count = 0;
        int flag = 0;
        int countDot = 0;
        for(int i = 0; i < newStr.length; i++){
            if(newStr[i].equals(" ")){ // chua khoang trang khong phai email hop le
                System.out.println("Email không hợp lệ");
                return;
            }
            if(newStr[i].equals("@")){ // kiem tra co ton tai ky tu @ khong
                count++;
                flag = 1;
            }
            if(flag == 1){ // neu co chua ky tu @
                if(newStr[i].equals(".")){ // kiem tra xem co ton tai ky tu . sau ky tu @ khong
                    countDot++;
                }
            }
        }

        if(count == 0 || count > 1){
            System.out.println("Email không hợp lệ");
        } else if (countDot == 0) {
            System.out.println("Email không hợp lệ");
        }
        else {
            System.out.println("Email hợp lệ");
        }

    }
}
