//Create a program to count the number of uppercase, lowercase, and digits in a given string using ASCII
// values.

package Char;
import java.util.Scanner;

public class Char9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();
        int len=s1.length();
        int j=0, k=0, l=0,m=0;
        for (int i=0;i<len;i++)
        {
            char ch=s1.charAt(i);
            j=ch;
            if(j>=65&&j<=90)//A-Z: 65-90.
            {
                k=k+j;
            }
            else if(j>=97&&j<=122)//a-z: 97 to 122
            {
                l=l+j;
            }
            else if(j>=48&&j<=57)//0-9: 48 to 57
            {
                m=m+j;
            }
        }
        System.out.println("The sum of ASCII values of all Uppercase characters " + "=" + k);
        System.out.println("The sum of ASCII values of all Lowercase characters " + "=" + l);
        System.out.println("The sum of ASCII values of all digits " + "=" + m);
    }
}
