/*throw is used to handle customised exceptions, they can be checked/unchecked.
If throw is used to handle checked customised exceptions, then it should be inherited from the
Exception class
If throw is used to handle unchecked customised exceptions, then it should be inherited from the
RuntimeException class.

It is fine not to declare try catch with the unchecked customised exception and just create a throw object.
But, if you create a throw object for a customised unchecked exception and do not declare try catch, then
the program will compile but the main method will be terminated. Hence, should always declare try catch
with unchecked customised exceptions as well.
*/

package OOPS.Exceptions;

public class Lab11_throw_uncheckedexception {
    public static void main(String[] args) {
        int age=9;
        try {
            if (age < 18) {
                throw new UnderAge1();
            } else {
                System.out.println("Please go.");
            }
        }
        catch (UnderAge1 e1)
        {
            e1.printStackTrace();
        }
        System.out.println("hello");
    }
}


class UnderAge1 extends RuntimeException
{
    UnderAge1()
    {
        super("Uff, cannot vote");
    }
}
