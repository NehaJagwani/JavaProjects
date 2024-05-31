/*
This method accepts the argument as a string.
parse() is available only for numeric data types+boolean. not available for
Character, String.
*/

package WrapperClasses;

public class Lab06_parseBoolean {
    public static void main(String[] args) {
        Boolean b=true;
        b.toString();
        System.out.println(b);

        Boolean b1=true;
        System.out.println(b.compareTo(b1));

        System.out.println(Boolean.parseBoolean("123"));

    }
}
