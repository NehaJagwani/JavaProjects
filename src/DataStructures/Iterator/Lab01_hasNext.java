package DataStructures.Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Lab01_hasNext {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add("Neha");
        al1.add(10);
        Iterator itr=al1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
