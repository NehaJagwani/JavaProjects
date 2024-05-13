//Write a Java program to remove a particular character from a string.

package String_Again;
import java.util.Scanner;

public class Lab12_CharacterRemoval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=sc.nextLine();
        System.out.println("Enter the character that you would like to remove: ");
        char targetChar=sc.next().charAt(0);
        boolean found=false;
        char arr1[]=new char[str1.length()];

        for (int i = 0; i <str1.length() ; i++) {
            if(targetChar==str1.charAt(i))
            {
                found=true;
                arr1[i]=' ';
                continue;
            }
            else
            {
                arr1[i]=str1.charAt(i);
            }
        }
        if(found==false)
        {
            System.out.println("The specific character does not exists in the string.");
        }
        else
        {

            for (int i = 0; i <arr1.length ; i++) {
                System.out.print(arr1[i]);
            }
        }
    }
}
