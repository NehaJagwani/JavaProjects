package String_Again;
import java.util.Scanner;

public class Lab10_StringCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1=sc.nextLine();
        System.out.println("Enter String2: ");
        String str2=sc.nextLine();

        if(str1.compareTo(str2)==0)
        {
            System.out.println("The two strings are equal");
        }
        else if (str1.compareTo(str2)>0)
        {
            System.out.println("String1 is greater than String2");
        }
        else if (str1.compareTo(str2)<0)
        {
            System.out.println("String2 is greater than String1");
        }
    }
}
