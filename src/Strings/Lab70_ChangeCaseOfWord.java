//Write a program to change the case of a word in Java.

package Strings;
import java.util.Scanner;

public class Lab70_ChangeCaseOfWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String. ");
        String str1=sc.nextLine();
        String arr1[]=str1.split(" ");
        System.out.println("Enter the word whose case needs to be changed. ");
        String str2=sc.nextLine();

         for (int i = 0; i < arr1.length ; i++) {
            if(arr1[i].equalsIgnoreCase(str2))
            {
                arr1[i]=arr1[i].toUpperCase();
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
    }
}
