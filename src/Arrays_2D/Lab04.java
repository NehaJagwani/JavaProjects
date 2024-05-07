//Assigning values of 1 2D Array to another 2D Array.

package Homework4thMay_2DArrays;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows to be present in a 2D Array: ");
        int num1=sc.nextInt();

        System.out.println("Enter the number of columns to be present in a 2D Array: ");
        int num2=sc.nextInt();

        int arr1[][]=new int[num1][num2];

        int arr2[][]=new int[num1][num2];

        System.out.println("Enter the Array Elements: ");

        for (int i = 0; i <num1 ; i++) {
            for (int j = 0; j < num2; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i <num1 ; i++) {
            for (int j = 0; j < num2; j++) {
                arr2[i][j]=arr1[i][j];
            }
        }

        System.out.println("The values assigned to Array2 are: ");
        for (int k = 0; k <num1 ; k++) {
            for (int l = 0; l <num2 ; l++) {
                System.out.print(arr2[k][l]);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
