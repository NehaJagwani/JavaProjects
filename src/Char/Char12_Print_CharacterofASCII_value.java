package Char;
import java.util.Scanner;

public class Char12_Print_CharacterofASCII_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an ASCII value: ");
        int i1=sc.nextInt();
        char ch=(char)i1;
        System.out.println("The character is "+ch);
    }
}
