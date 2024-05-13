//Compare two strings lexicographically (i.e., based on the order of characters in the Unicode chart).
//Write a Java method that returns 0 if the strings are equal,
// a positive value if the first string is lexicographically greater,
//and a negative value if the second string is lexicographically greater.

package Strings;
import java.util.Scanner;

public class Lab16_CompareStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1=sc.nextLine();
        System.out.println("Enter String2: ");
        String str2=sc.nextLine();

        if(str1.compareTo(str2)==0)
        {
            System.out.println("The two strings are equal. Return 0");
        }
        else if(str1.compareTo(str2)>0)
        {
            int i=str1.compareTo(str2);
            System.out.println("The first string is greater than the second string. Return "+i);

        } else if (str1.compareTo(str2)<0)
        {
            int j=str1.compareTo(str2);
            System.out.println("The first string is smaller than the second string. Return "+j);
        }
    }
}
