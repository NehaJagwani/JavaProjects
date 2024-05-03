package Homework_2ndMay_Arrays;
import java.util.Scanner;

public class Lab08_DoubleAnArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements to be present in an Array: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        float arr1[]=new float [num];
        System.out.println("Enter the Array elements");
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=sc.nextFloat();
        }

        System.out.println("The elements in the Array after doubling are: ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println(arr1[i]=arr1[i]*2);
        }
        sc.close();
        }
    }

