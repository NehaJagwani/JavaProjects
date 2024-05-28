/*Implement a Java program that reads a user's age and throws a custom InvalidAgeException if
the age is less than 0 or greater than 150.
*/

package OOPS.Exceptions.Throw;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        try
        {
            if (age<0 || age>150)
            {
                throw new InvalidAgeException("What an age?");
            }
            else
            {
                System.out.println("It's a valid age");
            }
        }
        catch (InvalidAgeException e)
        {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}

class InvalidAgeException extends RuntimeException
{
    InvalidAgeException()
    {
        super("It's an invalid age");
    }
    InvalidAgeException(String message)
    {
        super(message);
    }
}
