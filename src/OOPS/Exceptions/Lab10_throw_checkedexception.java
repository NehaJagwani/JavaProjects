/*throw is used to handle customised exceptions, they can be checked/unchecked.
If throw is used to handle checked customised exceptions, then it should be inherited from the
Exception class
If throw is used to handle unchecked customised exceptions, then it should be inherited from the
RuntimeException class.

If you create a throw object for a customised checked exception and do not declare try catch, then the
program will not compile, so should always use try catch in order to handle exceptions.
 */

package OOPS.Exceptions;

public class Lab10_throw_checkedexception {
    public static void main(String[] args) {
        int age=17;
        try {
            if (age < 18) {
                throw new UnderAge("What you cannot vote?");
            } else {
                System.out.println("Please go for voting");
            }
        }catch (UnderAge e)
        {
            e.printStackTrace();
        }
    }
}

class UnderAge extends Exception
{
    UnderAge()
    {
        super("Sorry, you cannot vote.");
    }
    UnderAge(String message)
    {
        super(message);
    }
}
