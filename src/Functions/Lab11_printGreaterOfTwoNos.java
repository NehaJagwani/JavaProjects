package Functions;
import java.util.Scanner;

public class Lab11_printGreaterOfTwoNos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1:");
        int num1=sc.nextInt();

        System.out.println("Enter Number2:");
        int num2=sc.nextInt();

        int greater=printGreaterofTwoNos(num1, num2);
        System.out.println("The greater number is"+" "+greater);
    }

    public static int printGreaterofTwoNos(int num1, int num2)
    {
        if(num1>num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
}
