//Write a program to reverse a string.

package Strings;
import java.util.Scanner;


public class Lab36_StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=new String(sc.nextLine());

        System.out.print("The reverse of the string "+str1+" "+"is :");

        for (int i=(str1.length()-1);i>=0;i--)
        {
            System.out.print(str1.charAt(i));
        }
    }
}
