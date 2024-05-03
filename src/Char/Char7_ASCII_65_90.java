//Create a program to print the characters corresponding to ASCII values from 65 to 90.
package Char;

public class Char7_ASCII_65_90 {
    public static void main(String[] args) {

        System.out.println("The characters corresponding to ASCII values from 65 to 90 are: \n");
        for (int i=65;i<=90;i++)
        {
            char ch=(char)i;
            System.out.print(ch+" ");
        }
    }
}
