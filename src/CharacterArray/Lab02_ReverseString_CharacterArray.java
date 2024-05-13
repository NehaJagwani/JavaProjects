package CharacterArray;
import java.util.Scanner;

public class Lab02_ReverseString_CharacterArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of characters in the Character Array:  ");
        int numChars=sc.nextInt();
        sc.nextLine();

        char arr1[]=new char[numChars];
        char arr2[]=new char[numChars];
        int j=0;

        System.out.println("Enter the elements in the Character Array. ");
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=sc.next().charAt(0);
        }

        //Reverse the array.
        for (int i = arr1.length-1 ;i>=0; i--) {
            arr2[j]=arr1[i];
            j++;
        }

        System.out.println("The reversed string in the character array is: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}
