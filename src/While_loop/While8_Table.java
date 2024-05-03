//Print table of any number using while loop.

package While_loop;
import java.util.Scanner;

public class While8_Table {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1=sc.nextInt();
        int i=1;
        int num2=0;
        System.out.printf("The multiplication of %d is: \n", num1);

        while(i<=10)
        {
            num2=num1*i;
            i++;
            System.out.println(num2);
        }

    }
}
