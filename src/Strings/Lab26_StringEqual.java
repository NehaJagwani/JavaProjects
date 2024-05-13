//Write a program to check if two strings are equal or not.

package Strings;

public class Lab26_StringEqual {
    public static void main(String[] args) {
        String str1="Neha";
        String str2="neha";
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Both the strings are equal");
        }
        else
        {
            System.out.println("Both the strings are not equal");
        }
    }
}
