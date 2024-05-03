package ForLoop;

public class For_Exceptions {
    public static void main(String[] args) {

        /*Allowed. Can give decimal value in condition.
        for (int i = 0; i < 5.5; i++) {
            System.out.println(i);
        }

        for (byte b = 0; b < 5.5; b++) {
            System.out.println(b);
        }*/

        /* Not allowed. Cannot give decimal value during initialization.
        for (int i = 0.5; i < 5.5; i++) {
            System.out.println(i);
        }
        for (byte b = 0.5; b < 5.5; b++) {
            System.out.println(i);
        }
        */

        /*Allowed. While initializing a float variable, have to give 'f' after decimal. In condition statement,
        it is optional to append f after the decimal.
        for (float f=1.5f;f<5.5;f++)
        {
            System.out.println(f);
        }*/

        /*Allowed
        for (float f=1.5f;f<5.5;f++) {
            System.out.println(f);
        }*/

        /*Not allowed because 'f' is not mentioned after decimal in initialization.
        for (float f=1.5;f<5.5f;f++) {
            System.out.println(f);
        }*/

        /*this will run in an infinite loop
        for(int i=0;i<=5;)
        {
            System.out.println(i);
        }*/


        /*this is allowed, it will print 0,1,2,3,4,5.
        for(int i=0;i<=5;)
        {
            System.out.println(i++);
        }*/

        /*this is allowed. It will print 1,2,3,4,5,6.
        for (int i = 0; i<=5;)
        {
            System.out.println(++i);
        }*/

        /*Not allowed. will throw an error. In the last, it should be either increment/decrement. Cannot be
        any other operators such as i*2, i/2 or i%2.
        for (int i = 0; i <= 5; i**) {
            System.out.println(i);
        }*/

        /*Allowed, this will print 0,2,4.
        for (int i = 0; i <=5 ; i++) {
            System.out.println(i++);
        }*/

        //Allowed, this will print 1,3,5.
        for (int i = 0; i <=5 ; i++) {
            System.out.println(++i);
        }
    }
    }


