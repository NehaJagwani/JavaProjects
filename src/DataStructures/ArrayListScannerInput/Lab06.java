package DataStructures.ArrayListScannerInput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        ArrayList<Object> al6=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values, type exit to finish ");
        while(sc.hasNext())
        {
            if(sc.hasNext().equa)
            {
            if(sc.hasNextInt())
            {
                al6.add(sc.nextInt());
            }
            else if(sc.hasNextDouble())
            {
                al6.add(sc.nextDouble());
            }
            else if(sc.hasNextFloat())
            {
                al6.add(sc.nextFloat());
            }
            else {
                al6.add(sc.next());
            }
        }

        System.out.println("Elements in the ArrayList are: ");
        Iterator itr=al6.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        /*for(Object element:al6)
        {
            System.out.println(element);
        }*/
        sc.close();
    }
}
