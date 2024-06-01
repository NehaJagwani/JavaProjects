/*Properties:
Sets are not threadsafe.
most widely used for API and selelenium.
1. Set can store only unique elements, duplicates are not allowed.
2. Set is an interface
3. It's same as Arraylist, the only difference is the underlying structure
4. In case of Set, the underlying structure is
5. HashSet is am implementation class of Set
6. HashSet will not follow insertion order/sorting order
7. Diference between HashSet and LinkedHashSet is HashSet does not follow insertion order but LinkedHashSet
follows insertion order.
8. Can print using SOP, for, foreach, Iterator
9. Stores only homogenous data
10.Null can be added.
 */

package DataStructures.HashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab01_HashSet {
    public static void main(String[] args) {
        Set<String> fruits=new HashSet();
        fruits.add("Apple");
        fruits.add("Mango");

        //If I store "Apple" again, it will store only 1 Apple as it stores unique characters. But lowercase "apple"
        //is allowed.
        fruits.add("Apple");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("aPple"));
        fruits.remove("Apple");
        fruits.add("Mango");

        //cannot store heteregenous data
       // fruits.add(1);

        System.out.println(fruits);

        Iterator itr=fruits.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Can print using foreach loop
        for(String str:fruits)
        {
            System.out.println(str);
        }

        //Can use foreach as below also
        for(Object element:fruits)
        {
            System.out.println(element);
        }



    }
}
