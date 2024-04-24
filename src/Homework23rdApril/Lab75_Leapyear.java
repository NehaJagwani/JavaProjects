//Assignment to check if the year is a Leap year or not.
//Leap year is if it meets all the 3 criteria i.e. divisible by 4,100,400. ex: 1600, 2000,2800.
//Leap year is if divisible by 4 but not by 100. ex: 2024.

package Homework23rdApril;
import java.util.Scanner;

public class Lab75_Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year: ");
        int num= sc.nextInt();
        if(num%4==0)
        {
            if(num%100==0) //check if the year is a century year.
            {
                if(num%400==0)
                {
                    System.out.printf("%d is a Leap Year", num);
                }
                else
                {
                    System.out.printf("%D is NOT a Leap Year", num);
                }
            }
            else
            {
                System.out.printf("%d is a Leap Year", num);
            }
        }
        else
        {
            System.out.printf("%d is NOT a Leap Year", num);
        }
        sc.close();
    }
}
