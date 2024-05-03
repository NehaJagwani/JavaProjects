//In for loop, the pre and post operators work the same way.
//for(;;) will not throw an error but will run in an infinite loop, see below. Only 2 semicolons are allowed.
//for loop will accept only numerical i.e. int, float, byte, short, long, double. Will not accept char/string/boolean.

package ForLoop;

public class Lab01_For_int {
    public static void main(String[] args) {


      /*  for (int i = 0; i <5 ; i++) {
            System.out.println(i);
            
        }*/

      /*  for (int i=0;i<5;++i)
        {
            System.out.println(i);
        }*/

   /*   for (int i = 5; i > 1; i--)
        {
            System.out.println(i);
        }*/

       /* for (int i = 5; i >1 ; --i) {
            System.out.println(i);
        }*/

       /* for(;;)
        {
            System.out.println("hi");
        }*/

      /*  for (int i = 0; i < 5; i++) {
            System.out.println(i++); //0,2,4
        }
        for (int i = 0; i < 5; ++i) {
            System.out.println(++i); //1,3,5,*/

      /*  for (int i = 5; i >0 ; i--) {
            System.out.println(i--);//5, 3, 1
        }*/

       /* for (int i = 5; i >0 ; --i) {
            System.out.println(--i);//4, 2, 0
        }*/

     /*   for (int i = 0; i <5 ; i++) {
            System.out.println(++i);//1, 3, 5
        }*/

     /*   for (int i = 0; i < 5; ++i) {
            System.out.println(i++);//0, 2, 4.
        }*/

     /*   for (int i = 0; i <5 ; i++) {
            System.out.println(i--); //0, 0, infinite loop.
        }*/

       /* for (int i = 0; i < 5; ++i) {
            System.out.println(--i); //-1, -1 infinite loop.
        }*/

       /* for (int i = 0; i < 5; i++) {
            System.out.println(--i); //-1, -1 infinite loop.
        }*/

    /*    for (int i = 0; i < 5; ++i) {
            System.out.println(i--);//0, 0 infinite loop.
        }*/

       /* for (int i = 5; i > 0; i++) {
            System.out.println(--i);//4, infinite loop
        }*/



        }
    }

