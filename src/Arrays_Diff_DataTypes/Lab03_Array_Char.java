package Arrays_Diff_DataTypes;
import java.util.Scanner;

public class Lab03_Array_Char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of characters to be entered in an Array: ");
        int num=sc.nextInt();

        char arr1[]=new char[num];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=sc.next().charAt(i);
        }
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
    }
}
