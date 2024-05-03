package Arrays;
import java.util.Scanner;

public class Lab23_CharArray_Scanner_incomplete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char arr1[]=new char[4];

        System.out.println("Enter the first character in an array: ");
        arr1[0]=sc.next().charAt(0);

        System.out.println("Enter the second character in an array: ");
        arr1[1]=sc.next().charAt(1);

        System.out.println("Enter the third character in an array: ");
        arr1[2]=sc.next().charAt(2);

        System.out.println("Enter the fourth character in an array: ");
        arr1[3]=sc.next().charAt(3);

        System.out.println("The characters in array are: ");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]);
            System.out.println(" ");
        }
    sc.close();
    }
}
