/*In Integer.valueOf(), you can pass either a string or a number.
But, the string cannot be an actual string like "Neha", then it will throw a
NumberFormatException. The string can be "123"*/

package WrapperClasses;

public class Lab10_IntegervalueOf {
    public static void main(String[] args) {

        System.out.println(Integer.valueOf("123"));
        System.out.println(Integer.valueOf(123));

        /*Below will throw NumberFormatException
        System.out.println(Integer.valueOf("Neha"));*/

        /*below 2 are not valid as they will return a unicode value
        System.out.println(Integer.valueOf('1')); //unicode value 49 will be returned
        System.out.println(Integer.valueOf('c')); //unicode value 99 will be returned*/
    }
}
