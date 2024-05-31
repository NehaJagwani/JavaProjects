//containsAll() return a boolean value.

package DataStructures.ArrayListMethods;

import java.util.ArrayList;

public class Lab14_containsAll {
    public static void main(String[] args) {
        ArrayList al16=new ArrayList();
        al16.add("Neha");
        al16.add("Raghu");
        al16.add("Kyra");

        ArrayList al17=new ArrayList();
        al17.add("Neha");
        al17.add("Raghu");

        System.out.println(al16.containsAll(al17));

        al17.add(10);
        System.out.println(al16.containsAll(al17));

    }
}
