package DataStructures.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lab05_previousIndex {
    public static void main(String[] args) {
        ArrayList al5=new ArrayList();
        al5.add("Neha");
        al5.add("Raghu");
        System.out.println(al5);

        ListIterator ltr=al5.listIterator();
        ltr.next();
        System.out.println(ltr.previousIndex());
    }
}
