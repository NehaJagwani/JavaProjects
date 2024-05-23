//Write a program to delete a word from a string using the Split method.

package Strings;
import java.util.Scanner;

public class Lab66_DeleteWord_UsingSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=sc.nextLine();

        String arr1[]=str1.split(" ");
        System.out.println("Enter the word to be deleted: ");
        String str2=sc.nextLine();

        System.out.println("The string after deleting the word is: ");
        for (int i = 0; i < arr1.length ; i++) {
            if(arr1[i].equals(str2))
            {
                continue;
            }
            else
            {
                System.out.println(arr1[i]);
            }
            }
        }
    }

