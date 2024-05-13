//Write a Java program to find length of a string without using the built-in function length().

package String_Again;
import java.util.Scanner;

public class Lab08_StringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        int length=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch!='\0')
            {
                length++;
            }
        }
        System.out.println("The length of the string "+str+" is "+" "+length);
    }
}
