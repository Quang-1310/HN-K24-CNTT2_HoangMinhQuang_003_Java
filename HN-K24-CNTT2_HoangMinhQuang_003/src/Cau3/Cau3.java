package Cau3;

public class Cau3 {
    public static void main(String[] args) {
        String s1 = "Dormitory";
        s1 = s1.toLowerCase();
        String s2 = "Dirty room";
        s2 = s2.toLowerCase();
        char[] arr1 = new char[256];
        char[] arr2 = new char[256];
        boolean flag = false;

        for(int i = 0; i < s2.length(); i++){
            arr1[s1.charAt(i)]++;
            arr2[s2.charAt(i)]++;
        }

        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            if(arr1[c] != arr2[c]){
                flag = true;
            }
        }

        if(flag){
            System.out.println("Hai chuoi khong phai Anagram");
        }
        else {
            System.out.println("Hai chuoi la Anagram");
        }
    }
}


