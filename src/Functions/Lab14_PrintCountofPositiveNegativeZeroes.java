//Write a program to enter numbers and enter the count of positive, negative and zeroes entered.

package Functions;
import java.util.Scanner;

public class Lab14_PrintCountofPositiveNegativeZeroes {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int num=sc.nextInt();
        int countPositive=0;
        int countNegative=0;
        int countZero=0;

        int arr1[]=new int[num];
        System.out.println("Enter the numbers: ");

        for (int i = 0; i <num ; i++) {
            arr1[i]=sc.nextInt();
        }
        printCountOfPositiveNegativeZeroes(arr1);
    }

    public static void printCountOfPositiveNegativeZeroes(int arr1[])
    {
        int countPositive=0;
        int countNegative=0;
        int countZero=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0)
            {
                countPositive=countPositive+1;
            }
            else if(arr1[i]<0)
            {
                countNegative=countNegative+1;
            }
            else if(arr1[i]==0)
            {
                countZero=countZero+1;
            }
        }
        System.out.println("The count of positive numbers is"+" "+countPositive);
        System.out.println("The count of negative numbers is"+" "+countNegative);
        System.out.println("The count of zeroes is"+" "+countZero);
    }
}
