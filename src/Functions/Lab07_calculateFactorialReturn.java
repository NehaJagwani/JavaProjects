package Functions;
import java.util.Scanner;

public class Lab07_calculateFactorialReturn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int fact=calculateFactorial(num);
       // System.out.println("The factorial of the number is"+" "+fact);
    }

    public static int calculateFactorial(int num)
    {
        if(num<0)
        {
            System.out.println("Invalid Number");
            return 1;
        }
        int fact=1;
        for (int i = num; i >0 ; i--) {
            fact = fact * i;
        }
        System.out.println("The factorial of the number is"+" "+fact);
        return fact;
    }
}
