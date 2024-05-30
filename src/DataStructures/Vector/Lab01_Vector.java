package DataStructures.Vector;

import java.util.ListIterator;
import java.util.Vector;

public class Lab01_Vector {
    public static void main(String[] args) {
        Vector v1=new Vector();
        v1.add("Neha");
        v1.add("Kyra");
        System.out.println(v1);

        ListIterator ltr=v1.listIterator();
        while(ltr.hasNext())
        {
            System.out.println(ltr.next());
        }
    }
}
