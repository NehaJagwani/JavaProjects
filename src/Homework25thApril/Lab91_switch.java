//Assignment using Switch statement. Take 2 integer inputs from the user, then ask the user which arithmetic
// operation does he want to perform whether '=', '-', '*', '/', '%'.
// These arithmetic inputs has to be taken in char format.

package Homework25thApril;
import java.util.Scanner;

public class Lab91_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println("What operation do you want to perform? ");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+':
                int num3=num1+num2;
                System.out.printf("The addition of both the numbers is %d\n", num3);
                break;
            case '-':
                int num4=num1-num2;
                System.out.printf("The subtraction of both the numbers is %d\n", num4);
                break;
            case '*':
                int num5=num1*num2;
                System.out.printf("The multiplication of both the numbers is %d\n", num5);
                break;
            case '/':
                int num6=num1/num2;
                System.out.printf("The division result of both the numbers is %d\n", num6);
                break;
            case '%':
                int num7=num1%num2;
                System.out.printf("The remainder of both the numbers is %d\n", num7);
                break;
            default:
                System.out.println("None of the Arithmetic operations can be performed\n");
        }
    }
}
