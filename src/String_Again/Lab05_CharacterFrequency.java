//Write a program to find the occurrences of each character in a string.

package String_Again;
import java.util.Scanner;

public class Lab05_CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        int count[]=new int[256]; //Assuming ASCII characters.
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(count[ch]!=0)
            {
                System.out.println("The character is"+" "+ch+" "+"and the count is"+" "+count[ch]);
                count[ch]=0;
            }
        }
    }
}
