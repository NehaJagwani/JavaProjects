//Write a program to delete a word in a string without using the split method.

package Strings;
import java.util.Scanner;

public class Lab67_DeleteWord_WithoutSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=sc.nextLine();
        System.out.println("Input the word to be deleted: ");
        String str2=sc.nextLine();
        String str3="";
        System.out.println("The string after deleting the word is :");
        for (int i = 0; i < str1.length(); i++) {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
                str3=str3+ch;
            }
            else if(str3.equals(str2))
            {
                str3="";
                continue;
            }
            else
            {
                System.out.println(str3);
                str3="";
            }
        }
    }
}
