//Write a program to swap two numbers.

package Swap2numbers;
import java.util.Scanner;

public class Swap_2_Nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2=sc.nextInt();
        int temp=0;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The values after Swapping are:");
        System.out.println("Number 1:"+" "+num1);
        System.out.println("Number 2:"+" "+num2);
    }
}
