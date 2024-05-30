/*set acts like a replace. It's syntax is set(index, object element). It will replace the element at the
specified index with the element specified inside set().*/

package DataStructures.ArrayList;

import java.util.ArrayList;

public class Lab16_set {
    public static void main(String[] args) {
        ArrayList al18=new ArrayList();
        al18.add("Neha");
        al18.add("Raghu");
        al18.set(1,"Kyra");
        System.out.println(al18);

    }
}
