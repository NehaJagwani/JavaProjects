/*Write a Java method that accepts an integer as input and throws an IllegalArgumentException
 if the input is negative
*/

package OOPS.Exceptions.Throw;
import java.util.Scanner;

public class Lab01_throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try {
            if (n < 0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("It's a positive number");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}

    class IllegalArgumentException extends RuntimeException
    {
        IllegalArgumentException()
        {
            super("It's a negative number.");
        }
    }

