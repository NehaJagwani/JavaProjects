package DataStructures.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab01_ArrayList_add {
    public static void main(String[] args) {
        List al1=new ArrayList();

        //add() will add the elements in the list in an index based order.
        al1.add("Neha");
        al1.add("40");
        al1.add("Raghu");
        al1.add("40");

        //If you print like this, elements will be printed in 1 line
        System.out.println(al1);

    }
}

