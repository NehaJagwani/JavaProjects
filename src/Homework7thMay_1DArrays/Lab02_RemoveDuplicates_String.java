//Write a program to remove duplicates from a string.

package Homework7thMay_1DArrays;
import java.util.Scanner;

public class Lab02_RemoveDuplicates_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result=result+ch;
            }
        }

        System.out.println("The string after removing the duplicate characters is"+" "+result);

    }
}
