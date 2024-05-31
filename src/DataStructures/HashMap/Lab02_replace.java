/*replace() will replace the value at the specified object*/

package DataStructures.HashMap;

import java.util.HashMap;

public class Lab02_replace {
    public static void main(String[] args) {
        HashMap h9=new HashMap();
        h9.put(101, "Neha");
        h9.put(102, "Kyra");
        System.out.println(h9);
        h9.replace(102,"Raghu");
        System.out.println(h9);
    }

}
