//If the data belongs to different data types, then to print using foreach each loop, use the word Object.


package DataStructures.ArrayList;
import java.util.ArrayList;

public class Lab09_foreach {
    public static void main(String[] args) {
        ArrayList al12=new ArrayList();
        al12.add("Neha");
        al12.add(10);

        for(Object element: al12)
        {
            System.out.println(element);
        }

    }
}


