//Write a Java program to convert a given character to its corresponding ASCII value.

package Char;
import java.util.Scanner;

public class Char4_PrintASCII_Given_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        int i1=(int)ch;
        System.out.println("The ASCII value of " + ch + " is " + i1+".");
    }
}
