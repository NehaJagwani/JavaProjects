//previous() will return the previous value.

package DataStructures.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lab03_previous {
    public static void main(String[] args) {
        ArrayList al3=new ArrayList();
        al3.add("Neha");
        al3.add("Raghu");

        ListIterator ltr=al3.listIterator();
        ltr.next();
        System.out.println(ltr.previous());

    }
}
