//Write a Java program to check if two strings are equal or not ignoring the case.

package String_Again;
import java.util.Scanner;

public class Lab09_StringEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1=sc.nextLine();
        System.out.println("Enter String2: ");
        String str2=sc.nextLine();

        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("The two strings are EQUAL");
        }
        else
        {
            System.out.println("The two strings are NOT EQUAL");
        }
    }
}
