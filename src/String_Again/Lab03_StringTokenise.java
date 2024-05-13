package String_Again;
import java.util.Scanner;

public class Lab03_StringTokenise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String arr1[]=str.split("[\\s,]+");
        System.out.println("The Tokenized String is: ");
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(arr1[i]);
        }
    }
}
