/*Properties of a HashMap
1. HashMap stores data in the form of key-value pairs.
2. Key always needs to be unique, but values can be duplicates. If you try to insert duplicate key with another
value, then the previous value will get replaced.
3. Key can have just 1 null value, values can have multiple null values
4. HashMap does not follow insertion order.
5. HashMap does not follow sorting order.
6. HashMap can store heteregenous data.
*/

package DataStructures.HashMap;

import java.util.HashMap;

public class Lab09_HashMapProperties {
    public static void main(String[] args) {

        //If you try to insert duplicate key with another value, then the previous value will get replaced.
        //Keys always need to be unique, but the values can be duplicates
        HashMap h10=new HashMap();
        h10.put(101, "Neha");
        h10.put(102, "Kyra");
        System.out.println(h10);
        h10.put(102, "Raghu");
        System.out.println(h10);

        //HashMap can have 1 null key.
        h10.put(null, null);
        System.out.println(h10);
        //If you do below, then the above null=null will be replaced by null=10
        h10.put(null, 10);
        System.out.println(h10);

        //Multiple nulls are allowed in value
        h10.put(103,null);
        h10.put(104,null);
        System.out.println(h10);

        //HashMap does not follow sorting order/insertion order
        h10.put(98,"Sheetal");
        System.out.println(h10);
    }
}
