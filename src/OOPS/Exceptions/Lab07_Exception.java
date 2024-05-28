/*1 Try, catch, finally cannot be executed independently.
2.	We can have multiple catch with 1 try. But, if the parent catch class has Exception e, then it cannot have multiple catch.
3.	1 try can have multiple catch
4.	Try block can also have 1 try catch block inside it.
5.	Even a catch block can have 1 try catch block inside it.
6.	With 1 try-catch, you can have just 1 finally block.
7.	We can even have a finally block inside try and then we can have try catch inside finally as well.
8.	We can have a finally block inside catch as well.
9.	The order will always be try->catch->finally. It cannot be try->finally->catch.
10.	If you write try and then SOP statement and then catch, then catch will not be executed.
*/


        package OOPS.Exceptions;

public class Lab07_Exception {
    public static void main(String[] args) {
        try {


        }
        catch (Exception e1)
        {
            try
            {

            }
            catch(Exception e3)
            {

            }
        }
    }
}
