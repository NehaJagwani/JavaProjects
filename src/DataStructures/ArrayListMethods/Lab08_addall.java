//addall will add all the elements from 1 ArrayList to another Arraylist
//For removeall() and addall(), you have to create 2 objects of an ArrayList

package DataStructures.ArrayListMethods;

import java.util.ArrayList;

public class Lab08_addall {
    public static void main(String[] args) {
        ArrayList al10=new ArrayList();
        al10.add("Neha");
        al10.add("Raghu");

        System.out.println(al10);

        ArrayList al11=new ArrayList();
        al11.addAll(al10);

        System.out.println(al11);
    }
}
