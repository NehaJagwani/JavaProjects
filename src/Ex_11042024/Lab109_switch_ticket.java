package Ex_11042024;
import java.util.Scanner;

public class Lab109_switch_ticket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        switch (age)
        {
            case 0,1,2,3,4:
                System.out.println("Your ticket is free");
                break;
            case 6,7,8,9,10,11,12:
                System.out.println("You need to pay child ticket");
                break;
            case 13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40
                    ,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
                System.out.println("You need to pay for an adult ticket price");
                break;
            default:
                System.out.println("Pls pay for senior citizen");
                break;
        }
        sc.close();
    }
}
