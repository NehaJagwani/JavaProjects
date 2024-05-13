//Write a program to find the substring of a given string.

package String_Again;
import java.util.Scanner;

public class Lab06_StringSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        System.out.println("Substrings of "+str+":");
        for (int i = 0; i <=str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
