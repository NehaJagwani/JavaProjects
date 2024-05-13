//Write a Java program to check if 2 strings are anagram of each other/not.

package String_Again;
import java.util.Arrays;
import java.util.Scanner;

public class Lab13_StringAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1=sc.nextLine();
        System.out.println("Enter String2: ");
        String str2=sc.nextLine();
        if(str1.length()==str2.length()) {
            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2))
            {
                System.out.println("Both the strings are Anagram of each other. ");
            }
            else
            {
                System.out.println("The strings are NOT Anagram of each other. ");
            }
        }
        else
        {
            System.out.println("The strings are not Anagram of each other. ");
        }
    }
}
