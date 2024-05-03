package Arrays_Diff_DataTypes;
import java.util.Scanner;

public class Lab01_Array_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements to enter in an Array: ");
        int num=sc.nextInt();
        int arr1[]=new int[num];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }

        System.out.println("The Array elements are: ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println(arr1[i]);
        }

    }
}
