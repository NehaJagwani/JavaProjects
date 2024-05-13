//Write a Java program to concatenate two strings without using the + operator.

package Strings;
import java.util.Scanner;

public class Lab15_Concatenate2Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String1: ");
        StringBuilder sb1=new StringBuilder(sc.nextLine());
        System.out.println("Enter String2: ");
        StringBuilder sb2=new StringBuilder(sc.nextLine());
        System.out.println("The concatenated string is: "+sb1.append(sb2));
    }
}
