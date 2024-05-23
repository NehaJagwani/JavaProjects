package Functions;
import java.util.Scanner;

public class Lab06_CaculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        calculateFactorial(num);
    }

    public static void calculateFactorial(int num)
    {
        if(num<0)
        {
            System.out.println("Invalid number. ");
            return;
        }

            int fact = 1;
            for (int i = num; i > 1; i--)
            {
                fact = fact * i;
            }
            System.out.println("The factorial of the number is"+" "+fact);
            return;
    }
}
