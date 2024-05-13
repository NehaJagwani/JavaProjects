//Write a program to find first non-repeated character in a string.

package String_Again;
import java.util.Scanner;

public class Lab11_String1stNonRepeatedChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        int count[]=new int[256];
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(count[ch]==1)
            {
                System.out.println("The first non repeated character in the string is"+" "+ch);
                break;
            }
        }
    }
}
