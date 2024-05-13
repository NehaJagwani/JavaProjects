//Create a Java method to remove leading and trailing whitespace characters from a given string.

package Strings;
import java.util.Scanner;

public class Lab19_WhitespaceTrimming {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=sc.nextLine();
        String str2="";
        str2=str1.trim();
        System.out.println("The string after removing leading and trailing whitespace characters is: "+str2);
    }
}
