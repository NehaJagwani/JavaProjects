/*If you have strings with the same name, when you perform remove(name), it will always remove the first
occurrence of the name*/

package DataStructures.ArrayListMethods;

import java.util.ArrayList;

public class Lab13_remove {
    public static void main(String[] args) {
        ArrayList al15=new ArrayList();
        al15.add("Neha");
        al15.add("Kyra");
        al15.add("Neha");
        al15.remove("Neha");
        System.out.println(al15);

    }
}
