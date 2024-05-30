//For removeall() and addall(), you have to create 2 objects of an ArrayList

package DataStructures.ArrayList;

import java.util.ArrayList;

public class Lab11_removeall {
    public static void main(String[] args) {
        ArrayList al13=new ArrayList();
        al13.add("Neha");
        al13.add("Raghu");

        System.out.print("Printing al13: ");
        System.out.println(al13);

        ArrayList al14=new ArrayList();
        al14.add("Neha");
        al14.add("Raghu");
        al14.add("Kyra");

        System.out.print("Printing al14: ");
        System.out.println(al14);

        al14.removeAll(al13);

        System.out.print("Printing al13: ");
        System.out.println(al13);

        System.out.print("Printing al14: ");
        System.out.println(al14);
    }
}
