/*
Write a Java program to create an ArrayList and add elements of type Integer to it.
Then, print the elements of the ArrayList.
 */

package DataStructures.ArrayListExercises;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integers to be added to the ArrayList: ");
        while(sc.hasNextInt())
        {
            int num=sc.nextInt();
            al1.add(num);
        }

        System.out.println("The elements in the ArrayList are: ");
        Iterator itr=al1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        sc.close();
    }
}
