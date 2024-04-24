package Ex_23042024;
import java.util.Scanner;

public class Lab71_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter side 1: ");
        int side1=sc.nextInt();

        System.out.println("Enter side 2: ");
        int side2=sc.nextInt();

        System.out.println("Enter side 3: ");
        int side3= sc.nextInt();

        if ((side1==side2) && (side1==side3) && (side2==side3))
        {
            System.out.printf("Hurray, it's an Equilateral triangle");
        }
        else if ((side1==side2) || (side1==side3) || (side2==side3))
        {
            System.out.println("Wow, it's an Isoceles triangle");
        }
        else
        {
            System.out.println("It's a scalene triangle");
        }
    }
}
