package Ex_11042024;
import java.util.Scanner;

public class Lab107_switch_calculategrade {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks=sc.nextInt();

        marks=marks/10;
        switch(marks)
        {
            case 9:
                System.out.println("Student got A grade");
                break;
            case 8:
                System.out.println("Student got B grade");
                break;
            case 7:
                System.out.println("Student got C grade");
                break;
            default:
                System.out.println("Student is Failed");
        }
    sc.close();
    }
}
