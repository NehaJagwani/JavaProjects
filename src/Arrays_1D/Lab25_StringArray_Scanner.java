//In the below program, the size of the array is 4 strings. However, we have not defined the 4th string.
//Hence, it will print null for the 4th string.
//Assume the inputs are string1: neha, string2: peehu, string3: raghu, the outout
//will be neha peehu raghu null.

package Arrays_1D;
import java.util.Scanner;

public class Lab25_StringArray_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr1[]=new String[4];

        System.out.println("Enter the first string: ");
        arr1[0]=sc.nextLine();

        System.out.println("Enter the second string: ");
        arr1[1]=sc.nextLine();

        System.out.println("Enter the third string: ");
        arr1[2]=sc.nextLine();

        System.out.println("The Strings in the array are: ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}
