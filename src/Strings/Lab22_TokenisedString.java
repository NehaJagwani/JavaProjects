//Write a Java program to tokenize a given string into words.
// \\s is used to remove whitespace characters. Other than that, whichever characters you want to remove,
//just mention after \\s
//the syntax is split([\\s]+.

package Strings;
import java.util.Scanner;

public class Lab22_TokenisedString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1=sc.nextLine();

        String s2[]=s1.split("[\\s,]+");

        for(String x:s2)
        {
            System.out.println(x);
        }
    }
}
