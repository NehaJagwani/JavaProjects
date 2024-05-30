package DataStructures.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lab04_nextIndex {
    public static void main(String[] args) {
        ArrayList al4=new ArrayList();
        al4.add("Neha");
        al4.add("Raghu");
        ListIterator ltr=al4.listIterator();
        ltr.next();
        System.out.println(ltr.nextIndex());
    }
}
