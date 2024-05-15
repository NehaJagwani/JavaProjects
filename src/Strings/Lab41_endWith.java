//In this method, cannot specify the index like the startswith().

package Strings;

public class Lab41_endWith {
    public static void main(String[] args) {
        String s1="This is Neha";
        boolean b1=s1.endsWith("ha");
        System.out.println(b1);

        //Below is not possible.
       // boolean b2=s1.endsWith(4,"is");
        //System.out.println(b2);
    }
}
