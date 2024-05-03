//Main program to double the values in array by taking the input from the user and doubling using for loop.
package Homework_2ndMay_Arrays;
import java.util.Scanner;


public class Lab04_DoubleAnArray {
    public static void main(String[] args) {
        float arr1[]=new float [3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values in an Array:");
        arr1[0]=sc.nextFloat();
        arr1[1]=sc.nextFloat();
        arr1[2]=sc.nextFloat();

        System.out.println("The original values in the Array are: "+arr1[0]+" "+","+arr1[1]+" "+","+arr1[2]);
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=arr1[i]+arr1[i];
        }

        System.out.println("The values in an array after doubling are: "+arr1[0]+" "+","+arr1[1]+" "+","+arr1[2]);
        sc.close();
    }
}
