package StringBuilder;
import java.util.Scanner;

public class Lab03_Insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");

        StringBuilder s1=new StringBuilder(sc.nextLine());
        System.out.println(s1.insert(4,"hi"));
        System.out.println(s1.insert(0,'s'));

    }
}
