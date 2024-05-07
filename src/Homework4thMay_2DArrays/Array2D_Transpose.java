//Find transpose of a 2D Array.

package Homework4thMay_2DArrays;
import java.util.Scanner;

public class Array2D_Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows to be present in a 2D Array: ");
        int num1=sc.nextInt();

        System.out.println("Enter the number of columns to be present in a 2D Array: ");
        int num2=sc.nextInt();

        int arr1[][]=new int[num1][num2];

        System.out.println("Enter the Array Elements: ");

         for (int i = 0; i <num1 ; i++) {
             for (int j = 0; j < num2; j++) {
                 arr1[i][j]=sc.nextInt();
             }
         }

        System.out.println("The Transposed Matrix is: ");
        for (int i = 0; i <num2 ; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print(arr1[j][i]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
