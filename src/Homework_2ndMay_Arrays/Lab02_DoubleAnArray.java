//Create a program to double an Array. {1,2,3} -> {4,5,6}
package Homework_2ndMay_Arrays;

public class Lab02_DoubleAnArray {
    public static void main(String[] args) {
       int arr1[]={1,2,3};

       System.out.println("The original values in the Array are: "+arr1[0]+" "+arr1[1]+" "+arr1[2]);
       arr1[0]=arr1[0]+arr1[0];
       arr1[1]=arr1[1]+arr1[1];
       arr1[2]=arr1[2]+arr1[2];

       System.out.println("The values in the Array after doubling are: "+arr1[0]+" "+arr1[1]+" "+arr1[2]);
    }
}
