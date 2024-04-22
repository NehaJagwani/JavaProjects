//final is a data type for which the value once assigned cannot be changed.
//If you try to change the value, it will throw an error.
//final is applicable to all data types.

package Ex_11042024;

public class Lab14_final {
    public static void main(String[] args) {
       final int i=67;
       //i=78;
        System.out.println(i);

        final float f=3.14f;
        //f=3.41f;
        System.out.println(f);

        final char c='A';
        //c='B';
        System.out.println(c);

        final short s=127;
        //s=128;
        System.out.println(s);

        final long l=9823114288l;
        //l=34l;
        System.out.println(l);

        final double d=89;
        //d=90;
        System.out.println(d);
    }
}
