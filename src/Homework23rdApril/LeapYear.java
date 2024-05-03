package Homework23rdApril;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=sc.nextInt();

        if((year%4==0)&&(year%100!=0)||(year%400==0))
        {
            System.out.println("It's a Leap Year");
        }
        else
        {
            System.out.println("It's not a Leap Year");
        }
        sc.close();
    }
}
