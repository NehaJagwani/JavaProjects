//Through get(), you can get a specific element from an arraylist.

package DataStructures.ArrayList;

import java.util.ArrayList;

public class Lab02_Arraylist_get {
    public static void main(String[] args) {
        ArrayList al2=new ArrayList();

        al2.add("Neha");
        al2.add("Kyra");

        System.out.println(al2.get(0));
        System.out.println(al2.getFirst());
        System.out.println(al2.getLast());

    }
}
