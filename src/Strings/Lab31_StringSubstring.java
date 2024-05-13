package Strings;
import java.util.Scanner;

public class Lab31_StringSubstring {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

      //  String str="Raghu";

        System.out.printf("The substring of " + str + " is : \n", str);
        int i=0,j=0;
        for(i=0;i<str.length();i++)
        {
            for(j=i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
