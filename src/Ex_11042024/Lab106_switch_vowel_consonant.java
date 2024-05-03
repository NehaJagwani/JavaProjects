package Ex_11042024;
import java.util.Scanner;

public class Lab106_switch_vowel_consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        switch (ch)
        {
            case  'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U':
                System.out.println("The character entered is a vowel");

            default:
                System.out.println("The character entered is a consonant");
        }
    sc.close();
    }
}
