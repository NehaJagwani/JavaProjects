//You can use default as your first case. BUt, if you use default as your first case, then break is
// mandatory.If you do not giv e break it will continue to print until the first
// break is encountered.
// If you use default as your last case, then break is not mandatory.
//2 default cases are not allowed in a single switch statement. You will get an error saying
//'duplicate default label'.


package Ex_11042024;
import java.util.Scanner;

public class Lab83_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        switch(num)
        {
            default:
                System.out.println("Not a valid number");
                break;
                case 1:
                System.out.println("Yes, it's correct");
                break;
            case 2:
                System.out.println("This is also correct");
                break;
        }

    }
}
