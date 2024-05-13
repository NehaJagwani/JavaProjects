//Write a program to check if the given string is palindrome or not.

package String_Again;
import java.util.Scanner;

public class Lab02_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String user_input=sc.nextLine();
        String reverse="";
        for (int i = user_input.length()-1; i >=0 ; i--) {
            reverse =reverse+user_input.charAt(i);
        }
        if(user_input.equalsIgnoreCase(reverse))
        {
            System.out.println("The given string is a palindrome.");
        }
        else
        {
            System.out.println("The given string is not a palindrome");
        }
    }
}
