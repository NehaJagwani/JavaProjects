package Do_While_Loop;
import java.util.Scanner;

public class Factorial_do_while_loop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        int i=1,fact=1;
        do {
            fact=fact*i;
            i++;
        }while(i<=num);

        System.out.printf("The factorial is %d", fact);

    }
}
