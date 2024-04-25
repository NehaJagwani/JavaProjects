//Duplicate case numbers are not allowed in switch statements.
// Here, I will get an error "duplicate case label".

package Ex_11042024;
import java.util.Scanner;

public class Lab81_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day=sc.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2: //duplicate case numbers are not allowed in switch statements.
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            default:
                System.out.println("Please enter a valid number");
        }
    }
}
