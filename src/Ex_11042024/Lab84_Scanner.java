//This program explains how to take user input for each data type i.e. int, float, short, double, long, char, string,
//boolean

package Ex_11042024;
import java.util.Scanner;

public class Lab84_Scanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age=sc.nextInt();

        System.out.println("Enter your Name: ");
        String str=sc.next();

        System.out.println("Enter your Salary: ");
        double sal=sc.nextDouble();

        System.out.println("Enter byte: ");
        byte b=sc.nextByte();

        System.out.println("Enter a character");
        char ch= sc.next().charAt(0);

        System.out.println("Enter float values");
        float f=sc.nextFloat();

        System.out.println("Enter a short value");
        short s=sc.nextShort();

        System.out.println("Enter a boolean value");
        boolean b1 = sc.nextBoolean();

        System.out.println("Enter a long value");
        long l=sc.nextLong();

        System.out.printf("Your name is %S\n",  str);
        System.out.printf("Your age is %d\n",  age);
        System.out.printf("Your sal is %f\n" , sal);
        System.out.printf("The  byte is %d\n" , b);
        System.out.printf("The character is %c\n",  ch);
        System.out.printf("The float value is %f\n",  f);
        System.out.printf("The short value is %d\n", s);
        System.out.printf("The boolean value is %B\n", b1);
        System.out.printf("The long value is %d", l);
    }
}
