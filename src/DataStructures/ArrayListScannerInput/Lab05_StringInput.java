package DataStructures.ArrayListScannerInput;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab05_StringInput {
    public static void main(String[] args) {
        ArrayList<String> al5=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings: type EXIT to finish");

        while(true)
        {
            String input=sc.next();
            if(input.equalsIgnoreCase("exit"))
            {
                break;
            }
            al5.add(input);
        }

        Iterator<String> itr=al5.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
