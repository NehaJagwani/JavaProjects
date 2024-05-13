//Print reverse of the string using a StringBuilder function.

package StringBuilder;
import java.util.Scanner;

public class Lab04_Reverse_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder user_input=new StringBuilder(sc.nextLine());
        String reverse=user_input.reverse().toString();
        System.out.println("The reverse of the String is"+" "+reverse);
    }
}
