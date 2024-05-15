//THis method takes the integer or string as a parameter and returns the last index position.

package Strings;

public class Lab42_lastindexOf {
    public static void main(String[] args) {
        String s1="This is a string";
        int i1=s1.lastIndexOf('i');
        System.out.println(i1);

        int i2=s1.lastIndexOf("is", 5);
        System.out.println(i2);
    }
}
