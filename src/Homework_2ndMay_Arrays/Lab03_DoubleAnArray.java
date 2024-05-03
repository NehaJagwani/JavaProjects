package Homework_2ndMay_Arrays;
import java.util.Scanner;

public class Lab03_DoubleAnArray {
    public static void main(String[] args) {
        float arr1[]=new float[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values in an Array: ");
        arr1[0]=sc.nextFloat();
        arr1[1]=sc.nextFloat();
        arr1[2]=sc.nextFloat();
        System.out.println("The original values in the Array are: "+arr1[0]+" "+","+arr1[1]+" "+","+arr1[2]);

        arr1[0]=arr1[0]+arr1[0];
        arr1[1]=arr1[1]+arr1[1];
        arr1[2]=arr1[2]+arr1[2];
        System.out.println("The values in the Array after doubling are: "+arr1[0]+" "+","+arr1[1]+" "+","+arr1[2]);

    }
}
