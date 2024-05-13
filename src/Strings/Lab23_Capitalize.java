//Write a Java program to capitalize the first letter of each word in a given sentence.

package Strings;
import java.util.Scanner;

public class Lab23_Capitalize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String words[]=str.split(" ");


        for (int i = 0; i < words.length ; i++) {
            char firstChar=words[i].charAt(0);

            char Uppercase=Character.toUpperCase(firstChar);
            words[i]=Uppercase+words[i].substring(1);
            System.out.println(words[i]);
        }
    }
}
