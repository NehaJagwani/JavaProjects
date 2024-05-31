/*
Search for an Element:
Write a Java program to create an ArrayList of Doubles and search for a specific element
in it. Print whether the element is found or not.
*/

package DataStructures.ArrayListExercises;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class Lab03 {
    public static void main(String[] args) {
        ArrayList<Double> al3=new ArrayList();
        Scanner sc=new Scanner(System.in);
        boolean found=false;
        al3.add(10.9);
        al3.add(90.9);
        al3.add(50.9);

        System.out.println("The values are: ");
        Iterator<Double> itr1=al3.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        System.out.println("Enter the element to be found: ");
        double num1=sc.nextDouble();

        Iterator<Double> itr2=al3.iterator();
        while(itr2.hasNext())
        {
            double num2= itr2.next();
            if(num1==itr2.next())
            {
                System.out.println("The element is found and it is"+" "+num2);
                found=true;
                break;
            }
        }

        if(found==false)
        {
            System.out.println("The specific element does not exist.");
        }
        sc.close();

    }
}
