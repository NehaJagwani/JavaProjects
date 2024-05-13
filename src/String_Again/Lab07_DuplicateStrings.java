//Write a Java program to remove duplicates from a string.
//Create an empty string named result.

package String_Again;
import java.util.Scanner;

public class Lab07_DuplicateStrings {
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
        System.out.println("The resulted string after removing the duplicates"+" "+"is"+" "+result);
    }
}
