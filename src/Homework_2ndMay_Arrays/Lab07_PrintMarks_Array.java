//Program to print marks using an Array.
package Homework_2ndMay_Arrays;
import java.util.Scanner;

public class Lab07_PrintMarks_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements to be present in an Array: ");
        int num=sc.nextInt();
        float marks[]=new float [num];

        System.out.println("Enter the Marks: ");
        for (int i = 0; i < marks.length ; i++) {
            marks[i]=sc.nextFloat();
        }

        System.out.println("The marks are: ");
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }

        float total=0;
        for (int i = 0; i < marks.length ; i++) {
            total=total+marks[i];
        }
        System.out.println("The total marks are : "+total);
        sc.close();
    }
}
