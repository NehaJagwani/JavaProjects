//Find the length of the string without using the built-in length().

package Strings;

import java.util.Scanner;

public class Lab18_StringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=new String(sc.nextLine());
        int length=0;

        for (char ch:str.toCharArray()) {
            if (ch!='\0')
            {
                length++;
            }
        }
        System.out.println("The length of the String is: "+length);
    }
}
