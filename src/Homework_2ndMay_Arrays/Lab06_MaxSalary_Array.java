//Find the max salary using an array and by taking the input from the user.

package Homework_2ndMay_Arrays;
import java.util.Scanner;

public class Lab06_MaxSalary_Array {
    public static void main(String[] args) {
        int arr1[]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary of the first employee: ");
        arr1[0]=sc.nextInt();

        System.out.println("Enter the salary of the second employee: ");
        arr1[1]=sc.nextInt();

        System.out.println("Enter the salary of the third employee: ");
        arr1[2]=sc.nextInt();

        int i=0,j=1,k=2;

            if(arr1[i]>arr1[j]&&arr1[i]>arr1[k])
            {
                System.out.println("Employee1 has the highest salary which is: "+arr1[i]);
            }
            else if(arr1[j]>arr1[i]&&arr1[j]>arr1[k])
            {
                System.out.println("Employee2 has the highest salary which is: "+arr1[j]);
            }
            else
            {
                System.out.println("Employee3 has the highest salary which is: "+arr1[k]);
            }

        sc.close();
    }
}
