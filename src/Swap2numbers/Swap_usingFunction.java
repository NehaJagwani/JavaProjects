package Swap2numbers;
import java.util.Scanner;

public class Swap_usingFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int num1=sc.nextInt();

        System.out.println("Enter Number2: ");
        int num2=sc.nextInt();
        swap(num1, num2);
    }
    static void swap(int num1, int num2) {
        int temp=0;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The numbers after swapping are: "+num1+" "+num2);
    }
}
