//To sort a string, you first need to convert the string to a character array.
//Then, you can either print the character array or convert the array first to a string and then print it.

package String_Again;
import java.util.Arrays;
import java.util.Scanner;

public class Lab14_SortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=sc.nextLine();

        //Convert string to a character array.
        char arr1[]=str1.toCharArray();

        //Sort the Array.
        Arrays.sort(arr1);

        //Convert the array back to the string and print the string.
        String str2=new String(arr1);
        System.out.println("The sorted string is "+str2);

        //OR just print the character array.
   /*     System.out.print("The sorted string is ");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]);*/
        }
    }

