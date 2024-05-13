package CharacterArray;
import java.util.Scanner;

public class Lab01_ReverseString_CharacterArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1=sc.nextLine();
        char arr1[]= str1.toCharArray();
        char arr2[]=new char[str1.length()];
        int j=0;

        for (int i = arr1.length-1; i >=0 ; i--) {
            arr2[j] = arr1[i];
            j++;
        }

            System.out.println("The reversed string using a character array is: ");
            for (int k = 0; k < arr2.length ; k++) {
                System.out.print(arr2[k]);
            }
    }
}
