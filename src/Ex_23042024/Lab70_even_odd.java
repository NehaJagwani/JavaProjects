package Ex_23042024;
import java.util.Scanner;

public class Lab70_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.printf("Hurray, %d is an even number", num);
        } else {
            System.out.printf("Omg,  %d is an odd number", num);
        }
        sc.close();
    }
}
