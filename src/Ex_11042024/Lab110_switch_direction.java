package Ex_11042024;
import java.util.Scanner;

public class Lab110_switch_direction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the direction: ");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'N','n':
                System.out.println("North");
                break;
            case 'S','s':
                System.out.println("South");
                break;
            case 'E','e':
                System.out.println("East");
                break;
            case 'W','w':
                System.out.println("West");
                break;
            default:
                System.out.println("Not allowed");
        }
        sc.close();
    }
}
