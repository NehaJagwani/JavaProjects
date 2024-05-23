//Two numbers are entered by the user, x and n. Write a function to find the value of one number
//raised to the power of another i.e. x^n.

package Functions;
import java.util.Scanner;

public class Lab15_calculatePow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1=sc.nextInt();
        System.out.println("Enter Number2");
        int num2=sc.nextInt();

        double result=pow(num1, num2);
        System.out.println("The answer is"+" "+result);
    }

    public static double pow(double num1, double num2)
    {
        double result=0;
        result=Math.pow(num1, num2);
        return result;
    }
}
