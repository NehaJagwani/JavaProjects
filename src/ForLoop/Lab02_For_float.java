//you cannot mix different data types in for loop. Example1 below, it will not return anything, will just return exit
//code as 0.

package ForLoop;

public class Lab02_For_float {
    public static void main(String[] args) {

        //While initializing a float variable, if it's a decimal value, have to give 'f' after decimal.
        // In condition statement, it is optional.
        for (float f=1.5f;f<5.5;f++)
        {
            System.out.println(f);
        }

        //Allowed.
        for (float f=1.5f;f<5.5f;f++) {
            System.out.println(f);
        }

        //Not allowed because 'f' is not mentioned after decimal in initialization.
      /*  for (float f=1.5;f<5.5f;f++) {
            System.out.println(f);
        }*/

        //Allowed.
        for (float f=1;f<3;f++) {
            System.out.println(f);
        }
        }
    }

