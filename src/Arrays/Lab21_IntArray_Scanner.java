package Arrays;
import java.util.Scanner;

public class Lab21_IntArray_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[5];

        System.out.println("Enter the 1st value in an array: ");
        arr1[0]=sc.nextInt();

        System.out.println("Enter the 2nd value in an array: ");
        arr1[1]=sc.nextInt();

        System.out.println("Enter the 3rd value in an array: ");
        arr1[2]=sc.nextInt();

        System.out.println("Enter ther 4th value in an array: ");
        arr1[3]=sc.nextInt();

        System.out.println("Enter ther 5th value in an array: ");
        arr1[4]=sc.nextInt();

        System.out.printf("The values in Array are : ");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]);
            System.out.print(" ");
        }

        sc.close();
    }

}
