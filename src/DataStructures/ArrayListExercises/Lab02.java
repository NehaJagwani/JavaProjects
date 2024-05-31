/*
Write a Java program to create an ArrayList of Strings and remove a specific element from it.
Print the updated ArrayList.
 */

package DataStructures.ArrayListExercises;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {
        ArrayList al2=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings to be added to the ArrayList");
        System.out.println("Type 'exit' to finish:");
        while(true)
        {
            String input=sc.next();
            if(input.equalsIgnoreCase("exit"))
            {
                break;
            }
            al2.add(input);
        }

        System.out.println("Strings in the ArrayList are: ");
        Iterator itr=al2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Enter the element to be removed");
        String removeElement=sc.next();
        al2.remove(removeElement);

        System.out.println("The ArrayList after removal is: ");
        Iterator itr1=al2.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
