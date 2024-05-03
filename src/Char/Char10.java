//Write a Java program to encrypt a string by adding a specific integer value to the ASCII value of
// each character.

package Char;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Char10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1=sc.nextLine();
        System.out.println("The ASCII Value for the given string is: ");
        int len=s1.length();
        int j=0;
        for (int i=0;i<len;i++)
        {
            char ch=s1.charAt(i);
            j=ch;
            System.out.print(j+" ");
        }
        sc.close();
    }
}
