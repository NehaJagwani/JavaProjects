//contains() return a boolean value.

package DataStructures.ArrayList;

import java.util.ArrayList;

public class Lab12_contains {
    public static void main(String[] args) {
        ArrayList al14=new ArrayList();
        al14.add("Neha");
        al14.add("Raghu");
        System.out.println(al14.contains("Neha"));
        System.out.println(al14.contains("Kyra"));
    }
}
