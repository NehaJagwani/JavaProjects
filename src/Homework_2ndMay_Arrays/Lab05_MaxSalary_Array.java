//Find the max salary using an array and by taking the input from the user.

package Homework_2ndMay_Arrays;
import java.util.Scanner;

public class Lab05_MaxSalary_Array {
    public static void main(String[] args) {
        int arr1[]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary of the first employee: ");
        arr1[0]=sc.nextInt();

        System.out.println("Enter the salary of the second employee: ");
        arr1[1]=sc.nextInt();

        System.out.println("Enter the salary of the third employee: ");
        arr1[2]=sc.nextInt();

        if(arr1[0]>arr1[1]&&arr1[0]>arr1[2])
        {
            System.out.println("Employee1 has the highest salary which is: "+arr1[0]);
        }
        else if(arr1[1]>arr1[0]&&arr1[1]>arr1[2])
        {
            System.out.println("Employee2 has the highest salary which is: "+arr1[1]);
        }
        else
        {
            System.out.println("Employee3 has the highest salary which is: "+arr1[2]);
        }
        sc.close();
    }
}
