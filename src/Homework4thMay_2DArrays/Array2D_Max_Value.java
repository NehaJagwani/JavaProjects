//Find the maximum value in a 2D array.

package Arrays_2D;
import java.util.Scanner;

public class Array2D_Max_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows to be present in a 2D Array:  ");
        int num1=sc.nextInt();

        System.out.println("Enter the number of columns to be present in a 2D Array:  ");
        int num2=sc.nextInt();

        int arr1[][]=new int[num1][num2];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < num1 ; i++) {
            for (int j = 0; j <num2 ; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }

        int max= Integer.MIN_VALUE;

        for (int i = 0; i <num1 ; i++) {
            for (int j = 0; j <num2 ; j++) {
                if(arr1[i][j]>max)
                {
                    max=arr1[i][j];
                }
            }

        }

        System.out.println("The values of the 2D Array are: ");
        for (int i = 0; i < num1 ; i++) {
            for (int j = 0; j <num2 ; j++) {
                System.out.print(arr1[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }
        System.out.println("The max value is : " + max);
    }
}
