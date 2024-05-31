package DataStructures.ArrayListMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Lab03_printArrayList {
    public static void main(String[] args) {
        ArrayList<String> al4=new ArrayList();
        al4.add("Neha");
        al4.add("40");

        //Printing using sop statement will print in 1 line
        System.out.println(al4);

        //Can also print using the traditional for loop
        for (int i=0;i<al4.size();i++)
        {
            System.out.println(al4.get(i));
        }

      //Can also print using the foreach loop if the elements belong to the same data type
        for(String element : al4)
        {
            System.out.println(element);
        }

        //Printing using the iterator method
        Iterator itr=al4.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ListIterator ltr=al4.listIterator();
        while(ltr.hasNext())
        {
            System.out.println(ltr.next());
        }
    }
}
