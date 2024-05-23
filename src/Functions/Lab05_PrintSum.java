package Functions;
import java.util.Scanner;

public class Lab05_PrintSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int i1=sc.nextInt();
        int i2=sc.nextInt();
        int sum=0;
        sum=printSum(i1, i2);
        System.out.println("The sum of two numbers is "+" "+sum);

    }
    public static int printSum(int i1, int i2)
    {
        int sum=i1+i2;
        return sum;
    }
}
