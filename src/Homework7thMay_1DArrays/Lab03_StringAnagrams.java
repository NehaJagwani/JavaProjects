//Write a program to find Anagrams of a string.

package Homework7thMay_1DArrays;
import java.util.Arrays;
import java.util.Scanner;

public class Lab03_StringAnagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String str2=sc.nextLine();


        if(str1.length()==str2.length())
        {
            //Convert strings to character array.
            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)) {
                System.out.println("The Strings are Anagrams of each other. ");
            }
            else
            {
                System.out.println("The Strings are not Anagrams of each other");
            }
        }
        else
        {
            System.out.println("The strings are not Anagrams of each other. ");
        }
    }
}
