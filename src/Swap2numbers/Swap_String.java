//Write a program to swap first two characters in a string. ex: abc becomes bac after swapping a & b.
//to swap characters in a string, convert a string first to a character array. Do the swapping, then convert
//the character array back to a string.

package Swap2numbers;
import java.util.Scanner;

public class Swap_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=sc.nextLine();

        //convert the string to a character array.
        char arr1[]=str1.toCharArray();

        //Swap the first and second characters.
        char temp=arr1[0];
        arr1[0]=arr1[1];
        arr1[1]=temp;

        //Convert the character array back to a string
        String str2=new String(arr1);
        System.out.println("The swapped string after swapping first two chracters in the string is : "+str2);
    }
}

