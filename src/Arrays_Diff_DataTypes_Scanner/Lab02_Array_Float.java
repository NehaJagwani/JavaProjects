package Arrays_Diff_DataTypes_Scanner;
import java.util.Scanner;

public class Lab02_Array_Float {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements in an Array: ");
        int num=sc.nextInt();
        float arr1[]=new float[num];

        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=sc.nextFloat();
        }

        for (int i = 0; i < arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
    }
}
