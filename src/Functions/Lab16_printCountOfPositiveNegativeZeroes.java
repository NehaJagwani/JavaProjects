//Write a program to enter the numbers till the user wants and at the end it should display the count of
// positive, negative and zeros entered.

package Functions;
import java.util.Scanner;

public class Lab16_printCountOfPositiveNegativeZeroes {
    public static void main(String[] args) {
        int countPositive=0, countNegative=0, countZero=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to continue and 0 to stop");
        int input=sc.nextInt();
        while(input==1)
        {
            System.out.println("Enter the Number: ");
            int num=sc.nextInt();
            if(num>0)
            {
                countPositive=countPositive+1;
            } else if (num<0)
            {
                countNegative=countNegative+1;
            }
            else
            {
                countZero=countZero+1;
            }
            System.out.println("Press 1 to continue and 0 to stop");
            input=sc.nextInt();
        }
        System.out.println("The count of Positive numbers is"+" "+countPositive);
        System.out.println("The count of Negative numbers is"+" "+countNegative);
        System.out.println("The count of Zeroes is"+" "+countZero);
    }
}
