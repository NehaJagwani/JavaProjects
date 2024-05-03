//Write a JAVA program to print the marks using an array.

package Homework_2ndMay_Arrays;
import java.util.Scanner;

public class Lab01_PrintmarksusingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float marks[]=new float[5];
        System.out.println("Enter marks for English: ");
        marks[0]=sc.nextFloat();

        System.out.println("Enter marks for Maths: ");
        marks[1]=sc.nextFloat();

        System.out.println("Enter marks for Science: ");
        marks[2]=sc.nextFloat();

        System.out.println("Enter marks for Social Science: ");
        marks[3]=sc.nextFloat();

        System.out.println("Enter marks for History Civics: ");
        marks[4]=sc.nextFloat();

        System.out.print("The marks for the English subject are: "+marks[0]+'\n');
      //  System.out.printf("The marks for the English subject are %f:  \n", marks[0]);
        System.out.printf("The marks for the Maths subject are %f.  \n", marks[1]);
        System.out.printf("The marks for the Science subject are %f.  \n", marks[2]);
        System.out.printf("The marks for the Social Science subject are %f.  \n", marks[3]);
        System.out.printf("The marks for the History Civics subject are %f.  \n", marks[4]);

        float total=0;

        for (int i = 0; i < marks.length ; i++)
        {
            total=total+marks[i];
        }

       System.out.printf("The total marks are %f. ", total);
        sc.close();
    }
}
