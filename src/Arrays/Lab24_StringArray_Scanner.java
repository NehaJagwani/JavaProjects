package Arrays;
import java.util.Scanner;

public class Lab24_StringArray_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr1[]=new String[3];

        System.out.println("Enter the first string: ");
        arr1[0]=sc.next();

        System.out.println("Enter the second string: ");
        arr1[1]=sc.next();

        System.out.println("Enter the third string: ");
        arr1[2]=sc.next();

        System.out.println("The Strings in the array are: ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}
