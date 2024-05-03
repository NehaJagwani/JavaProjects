//Calculate multiplication of any number upto the power of 10.

package ForLoop;
import java.util.Scanner;

public class Table_ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
        int num2=0;

        System.out.printf("The multiplication of %d is:\n", num1);

        for(int i=1;i<=10;i++)
        {
            num2=num1*i;
            System.out.println(num2);
        }
    sc.close();
    }
}
