//There is no add() in HashMap. If you want to add elements in a HashMap, use put()

package DataStructures.HashMap;

import java.util.HashMap;

public class Lab01_put {
    public static void main(String[] args) {
        HashMap hm1=new HashMap();
        hm1.put(101,"Neha");
        hm1.put(102,"Kyra");
        System.out.println(hm1);
    }
}
