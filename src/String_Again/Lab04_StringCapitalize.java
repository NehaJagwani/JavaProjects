//Write a program to print first character of each word in uppercase.

package String_Again;
import java.util.Scanner;

public class Lab04_StringCapitalize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String words[]=str.split("[\\s,]+");

        System.out.println("The string is: ");
        for (int i = 0; i <words.length ; i++) {
            char firstChar=words[i].charAt(0);
            Character upperCase=Character.toUpperCase(firstChar);
            words[i]=upperCase+words[i].substring(1);
            System.out.println(words[i]);
        }
    }
}
