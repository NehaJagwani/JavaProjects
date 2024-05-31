/*
parseInt() is available only for numeric data types+boolean. not available for
Character, String.
This method accepts the argument as a string.
You should pass a string such as "123" in parseInt, then it will work.
If you try to pass an actual string i.e. "Neha", then it will throw a NumberFormatException which
should be handled gracefully like below.
*/

package WrapperClasses;

public class Lab08_Integer_parseInt {
    public static void main(String[] args) {

       // System.out.println(Integer.parseInt("123"));
        try {
            String str = "Neha";
            int n = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Kindly enter a valid integer");
        }

        //this is allowed.
        System.out.println(Integer.parseInt("123"));
    }
}


