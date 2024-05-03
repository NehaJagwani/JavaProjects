//Develop a program to find the sum of ASCII values of all characters in a given string.

package Char;
import java.util.Scanner;

public class Char8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: \n ");
        String s1=sc.nextLine();
        int len=s1.length();
        int j=0,k=0;
        for (int i=0;i<len;i++)
        {
            char ch = s1.charAt(i);
            j = ch;
            k=k+j;
        }
        System.out.println("The sum of ASCII characters in " + s1 + " = " + k);
        sc.close();
    }
}
