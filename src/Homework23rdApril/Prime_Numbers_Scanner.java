package Homework23rdApril;
import java.util.Scanner;

public class Prime_Numbers_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean prime=false;
        int div=2;
        while(div<num) {
            if (num % div == 0) {

                prime=false;
                break;

            } else {
                div++;
            }
        }
        if(div==num)
        {
            prime=true;
        }
        if(prime==false)
        {
            System.out.printf("%d is NOT a Prime Number\n", num);
        }
        else
        {
            System.out.printf("%d is a Prime Number\n", num);
        }

    }
}
