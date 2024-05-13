package Strings;
import java.util.Scanner;

public class Lab35_StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string, I will check if it is Palindrome or not.");
        String user_input=sc.next();
        StringBuilder sb=new StringBuilder(user_input);
        String rev_input=sb.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_input))
        {
            System.out.println("It's a Palindrome.");
        }
        else
        {
            System.out.println("Nope.");
        }
    }
}
