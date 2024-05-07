package Homework_2ndMay_Arrays;
import java.util.Scanner;

public class Lab10_MaxSalary_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to be present in an Array: ");
        int num=sc.nextInt();
        int sal[]=new int[num];
        int max= Integer.MIN_VALUE;

        System.out.println("Enter the Employee's salaries: ");

        for (int i = 0; i < sal.length ; i++) {
            sal[i]=sc.nextInt();
        }


            for (int i = 0; i < sal.length ; i++) {
            if(sal[i]>max)
            {
                max=sal[i];
            }
        }

        System.out.println("The maximum salary is : " +max + ".");
    }
}
