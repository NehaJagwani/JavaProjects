/*
This method accepts the argument as a string.
parse() is available only for numeric data types+boolean. not available for
Character, String.
*/

package WrapperClasses;

public class Lab02_parseFloat {
    public static void main(String[] args) {

        System.out.println(Float.parseFloat("123"));

        try {
            String str="Neha";
            float n=Float.parseFloat(str);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Enter valid input.");
        }
    }
}
