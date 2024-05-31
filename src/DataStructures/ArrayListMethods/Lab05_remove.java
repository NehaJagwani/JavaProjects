package DataStructures.ArrayListMethods;

import java.util.ArrayList;

public class Lab05_remove {
    public static void main(String[] args) {
        ArrayList al6=new ArrayList();
        ArrayList al7=new ArrayList();
        al6.add("Neha");
        al6.add("Raghu");

        //If want to remove a string, then can provide either the string/index in the remove method
        al6.remove("Neha");
        System.out.println(al6);

        //If want to remove an integer, then need to provide index in the remove method.
        al7.add(2.5);
        al7.add("Kyra");

        System.out.println(al7);

        al7.remove(0);
        System.out.println(al7);
    }
}
