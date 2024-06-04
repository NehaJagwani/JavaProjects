//compareToIgnoreCase() will compare two strings lexicographically and will ignore the case.

package StringFunctions;

public class Lab09_compareToIgnoreCase {
    public static void main(String[] args) {

        //wil return 0
        System.out.println("Raghu".compareToIgnoreCase("raghu"));

        //when the characters are different, it calculates the difference between their ASCII values.
        //compare() and compareToIgnoreCase() will return the same output if the characters to compare are
        //different.

        //'K'(75), 'y'(121)
        System.out.println("Ne".compareToIgnoreCase("n"));

    }
}
