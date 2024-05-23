package Functions;
import java.util.Scanner;

public class Lab08_printAverage_Return {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int num1=sc.nextInt();

        System.out.println("Enter Number2: ");
        int num2=sc.nextInt();

        System.out.println("Enter Number3: ");
        int num3=sc.nextInt();

        float avg=printAverage(num1, num2, num3);
        System.out.println("The average is "+" "+avg);
    }
    public static float printAverage(int  num1, int num2, int num3)
    {
        float avg=(float)(num1+num2+num3)/3;
        return avg;
    }
}
