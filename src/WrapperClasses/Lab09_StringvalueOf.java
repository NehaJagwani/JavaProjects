/*
String.valueOf() can be used for integer, char, double, float, boolean, character, string.
When you are doing String.valueOf(string), the string argument can be "123" or "Neha".
*/

package WrapperClasses;

public class Lab09_StringvalueOf {
    public static void main(String[] args) {
        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf('c'));
        System.out.println(String.valueOf(9823114288l));
        System.out.println(String.valueOf(3.14f));
        System.out.println(String.valueOf(10.9));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf("123"));
        System.out.println(String.valueOf("Neha"));

    }
}
