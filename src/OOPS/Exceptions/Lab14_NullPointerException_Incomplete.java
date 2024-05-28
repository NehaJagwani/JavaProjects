package OOPS.Exceptions;
import java.util.Scanner;

public class Lab14_NullPointerException_Incomplete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String.");
        String s1=sc.next();

        try
        {
            int length=s1.length();
            if(length==0)
            {
                System.out.println("I am null");
            }
            else
            {
                System.out.println(s1);
            }
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
