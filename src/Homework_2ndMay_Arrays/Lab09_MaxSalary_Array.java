package Homework_2ndMay_Arrays;
import java.util.Scanner;

public class Lab09_MaxSalary_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements to be present in an Array: ");
        int num=sc.nextInt();

        int sal[]=new int[num];
        System.out.println("Enter the Employee's Salaries: ");
        for (int i = 0; i < sal.length ; i++) {
            sal[i]=sc.nextInt();
        }

        int max=0;
        for (int i = 0; i < sal.length ; i++) {
            if(sal[i]>max) {
                max=sal[i];
            }
        }
        System.out.println("The maximum salary is: "+max);
    }
}
