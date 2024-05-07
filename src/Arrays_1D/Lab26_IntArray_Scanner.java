//In the below program, the size of the array is 3. However, we have not defined the 3rd value.
//Hence, it will print 0 for the 4th value.
//Assume the inputs are 1,2. The output will be 1,2,0.

package Arrays_1D;
import java.util.Scanner;

public class Lab26_IntArray_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[3];
        System.out.println("Enter the values in an array : ");
        arr1[0]=sc.nextInt();
        arr1[1]=sc.nextInt();
        System.out.println("The values in an Integer array are: ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
    }
}
