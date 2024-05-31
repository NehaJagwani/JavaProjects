//Write a Java program to take user input as an integer and store it in the ArrayList

package DataStructures.ArrayListScannerInput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab01_IntegerInput {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer elements to be added to the ArrayList: ");
        while(sc.hasNextInt())
        {
            int num1=sc.nextInt();
            al1.add(num1);
        }

        System.out.println("The elements in the ArrayList are: ");
        Iterator<Integer> itr=al1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        sc.close();
       }
}

