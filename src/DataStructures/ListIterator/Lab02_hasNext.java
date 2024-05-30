package DataStructures.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lab02_hasNext {
    public static void main(String[] args) {
        ArrayList al2=new ArrayList();
        al2.add("Neha");
        al2.add("Raghu");

        ListIterator ltr=al2.listIterator();
        while(ltr.hasNext())
        {
            System.out.println(ltr.next());
        }
    }
}
