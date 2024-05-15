
package Strings;

public class Lab40_startsWith {
    public static void main(String[] args) {
        String s1="This is Neha";
        boolean b1=s1.startsWith("is");
        System.out.println(b1);

        //Alternate way to specify position as well.
        boolean b2=s1.startsWith("is", 2);
        System.out.println(b2);
    }
}
