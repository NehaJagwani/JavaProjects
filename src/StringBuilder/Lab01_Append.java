//This program will append.

package StringBuilder;
import java.util.Scanner;

public class Lab01_Append {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        StringBuilder s1=new StringBuilder(sc.nextLine());

        System.out.println("Enter String 2: ");
        String s2=new String(sc.nextLine());

        System.out.println(s1.append(s2));
    }
}
