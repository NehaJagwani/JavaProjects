package Homework7thMay_1DArrays;
import java.util.Scanner;

public class Lab01_ReverseAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String user_input=sc.nextLine();
        String reverse="";

        for (int i = user_input.length()-1 ;i>=0; i--) {
            char ch=user_input.charAt(i);
            reverse=reverse+ch;
        }

        System.out.println("The reverse of the string"+" "+ user_input+" "+"is"+" "+reverse);
    }
}
