//Write a program to reverse the case of each character in a string. This can also be done using Lab46.
//To convert uppercase to lowercase, add 32.
//To convert lowercase to uppercase, subtract 32.

package Strings;
import java.util.Scanner;

public class Lab45_String_ReverseEachCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();

        char arr1[]=new char[str.length()];

        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            int i1=(int)ch;
            if(i1>=65&&i1<=90)
            {
                i1=i1+32;
                char ch1=(char)i1;
                arr1[i]=ch1;
                System.out.print(ch1);
            }
            else if(i1>=97&&i1<=122)
            {
                i1=i1-32;
                char ch1=(char)i1;
                arr1[i]=ch1;
                System.out.print(ch1);
            }
            else if ((i1==32||i1>=33&&i1<=64)||(i1>=91&&i1<=96)||(i1>=123&&i1<=126))
            {
                arr1[i]=ch;
                System.out.print(ch);
            }
        }
    }
}
