//Assignment to check if the number is a positive number or a negative number or 0.

package Homework23rdApril;
import java.util.Scanner;

public class Lab73_positivenegativezeronumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if((num==0))
        {
            System.out.println("The number is 0");
        }
        else if (num>0)
        {
            System.out.println("The number is a positive number");
        }
        else if (num<0)
        {
            System.out.println("The number is a negative number");
        }
    sc.close();
    }
}
