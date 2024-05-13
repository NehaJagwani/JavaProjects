//Concat is a method of String class.
//Append is a method of String Buffer class.


package StringBuilder;
import java.util.Scanner;

public class Concat_vs_Append {
    public static void main(String[] args) {
     /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1=new String(sc.nextLine());

        System.out.println("Enter String 2: ");
        String s2=new String(sc.nextLine());

        System.out.println("The string after concatenating is"+" "+s1.concat(s2));*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        StringBuilder s1=new StringBuilder(sc.nextLine());

        System.out.println("Enter String 2: ");
        StringBuilder s2=new StringBuilder(sc.nextLine());

        System.out.println("The string after concatenating is"+" "+s1.append(s2));
    }
}
