//Print factorial of a given number using for loop.
package ForLoop;
import java.util.Scanner;

public class Factorial_For_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
        int fact=1;

        System.out.printf("The factorial of %d is: \n", num1);

        for(int i=1;i<=num1;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
