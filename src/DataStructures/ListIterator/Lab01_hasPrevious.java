//hasPrevious returns a boolean value.
//previous() returns an actual value

// hasPrevious is available only in ListIterator. It is not available ion Iterator class.
//To use hasPrevious(), first take the cursor to the last position by using next(), see below.

package DataStructures.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Lab01_hasPrevious {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add("Neha");
        al1.add("Raghu");


        ListIterator ltr=al1.listIterator();
        ltr.next();
        ltr.next();

       while(ltr.hasPrevious())
        {
            System.out.println(ltr.previous());
        }
    }
}
