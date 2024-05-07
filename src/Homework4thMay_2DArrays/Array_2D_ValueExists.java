//Find if a specific element exists or not in a 2D Array.

package Homework4thMay_2DArrays;
import java.util.Scanner;

public class Array_2D_ValueExists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows to be present in a 2D Array: ");
        int num1=sc.nextInt();

        System.out.println("Enter the number of columns to be present in a 2D Array: ");
        int num2=sc.nextInt();

        int arr1[][]=new int[num1][num2];

        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < num1 ; i++) {
            for (int j = 0; j < num2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

            System.out.println("Which element do you want to find in the Array?");
            int num3=sc.nextInt();

            boolean found=false;

            outerloop:
            for (int k = 0; k <num1 ; k++) {
                for (int l = 0; l <num2 ; l++) {
                    if(arr1[k][l]==num3)
                    {
                        found=true;
                        break outerloop;
                    }
                }
            }

            if(found==true)
            {
                System.out.println("Hurray, the element"+" "+num3+" "+"exists in the Array.");
            }
            else
            {
                System.out.println("Oh No!.The element"+" "+num3+" "+"does not exists in the Array.");
            }
    }
}
