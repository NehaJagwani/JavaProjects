//Write a program to reverse a string.

package String_Again;
import java.util.Scanner;

public class Lab01_StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String user_input=sc.nextLine();
        System.out.print("The reverse of"+" "+user_input+" "+"is :");
        for (int i = user_input.length()-1; i>=0; i--) {
            System.out.print(user_input.charAt(i));
        }
    }
}
