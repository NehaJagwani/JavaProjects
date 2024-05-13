package Homework4thMay_2DArrays;
import java.util.Scanner;

public class Array_2D_DuplicateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=sc.nextLine();

        String result = "";

        System.out.println("The original string is "+str1);

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
                                          }
        }
        System.out.println("The string after removing the duplicates are: " + result);
    }
}


