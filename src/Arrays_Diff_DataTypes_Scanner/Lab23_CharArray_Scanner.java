package Arrays_Diff_DataTypes_Scanner;
import java.util.Scanner;

public class Lab23_CharArray_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of characters
        System.out.print("Enter the number of characters: ");
        int numChars = scanner.nextInt();

        // Consume newline character
        scanner.nextLine();

        // Create a character array to store the characters
        char[] charArray = new char[numChars];

        // Prompt the user to enter each character
        for (int i = 0; i < numChars; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            charArray[i] = scanner.nextLine().charAt(0);
        }

        // Print the character array
        System.out.println("Character Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
