//Write a Java program to determine if the string is a palindrome or not.

package Strings;
import java.util.Scanner;

public class Lab17_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String user_input=sc.nextLine();
        String reverse="";

        for (int i = user_input.length()-1; i >=0 ; i--) {
            reverse=reverse+user_input.charAt(i);
        }

        if(user_input.compareToIgnoreCase(reverse)==0)
        {
            System.out.println("The String is a Palindrome.");
        }
        else
        {
            System.out.println("The String is NOT a Palindrome.");
        }
    }
}
