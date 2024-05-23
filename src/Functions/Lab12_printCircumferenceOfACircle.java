package Functions;
import java.util.Scanner;

public class Lab12_printCircumferenceOfACircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        int radius=sc.nextInt();
        float circumference=printCircumference(radius);
        System.out.println("The circumference of the circle is"+" "+circumference);
    }

    public static float printCircumference(int radius)
    {
        float circumference=0.0f;
        float pi=3.14f;
        circumference=2*pi*radius;
        return circumference;
    }
}
