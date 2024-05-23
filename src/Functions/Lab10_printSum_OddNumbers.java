package Functions;
import java.util.Scanner;

public class Lab10_printSum_OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int num = sc.nextInt();
        int arr1[] = new int[num];

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < num; i++) {
            arr1[i] = sc.nextInt();
        }
        printSumOfOddNumbers(arr1);
    }

    public static void printSumOfOddNumbers(int arr1[]) {
        int sum=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                sum = sum + arr1[i];
            }
        }
        System.out.println("The sum of odd numbers is" + " " + sum);
    }
}
