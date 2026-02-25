package Cau2;

import java.util.Scanner;

// Cau 2 - Phan 1: Loai bo phan tu trung
public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so phan tu: ");
        n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        boolean exist = false; // bien kiem tra cac so trung lap
        for(int i = 0; i < arr.length - 1; i++){
            exist = false;
            for(int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    exist = true;
                    break;
                }
            }

            if(!exist){ // neu trung lap thi xoa va giam kich thuoc mang
                for(int j = i; j < n - 1; j++){
                    arr[j] = arr[j + 1];
                }
                n--;
            }
        }


        for(int i = 0; i < n; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}



