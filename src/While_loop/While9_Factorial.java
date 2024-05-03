//Print factorial of a given  number using while loop.
package While_loop;
import java.util.Scanner;

public class While9_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1=sc.nextInt();
        int i=1, fact=1;

        System.out.printf("The factorial of %d is: \n" ,num1);

        while(i<=num1)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
        sc.close();
    }
}
