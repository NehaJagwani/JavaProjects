/*
This method accepts the argument as a string.
parse() is available only for numeric data types+boolean. not available for
Character, String.
*/

package WrapperClasses;

public class Lab03_parseDouble {
    public static void main(String[] args) {
        System.out.println(Double.parseDouble("123"));

        /*Below is not allowed
        System.out.println(Double.parseDouble("Neha"));*/
    }
}
