//Assignment to check the maximum of the three numbers.
package Homework23rdApril;
import java.util.Scanner;

public class Lab74_Maxof3nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1=sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2=sc.nextInt();

        System.out.println("Enter 3rd number: ");
        int num3=sc.nextInt();

        if((num1>num2) && (num1>num3))
        {
            System.out.printf("Num1 i.e. %d is the max of three numbers", num1);
        }
        else if ((num2>num1) && (num2>num3))
        {
            System.out.printf("Num2 i.e. %d is the max of the three numbers", num2);
        }
        else if ((num3>num1) && (num3>num2))
        {
            System.out.printf("Num3 i.e. %d is the max of the three numbers", num3);
        }
        sc.close();
    }
}
