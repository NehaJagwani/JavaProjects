package Functions;
import java.util.Scanner;

public class Lab13_printEligibleToVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the person's age: ");
        int age=sc.nextInt();
        printEligibleToVote(age);
    }
    public static void printEligibleToVote(int age)
    {
        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
           System.out.println("Not Eligible to Vote");
        }
    }
}
