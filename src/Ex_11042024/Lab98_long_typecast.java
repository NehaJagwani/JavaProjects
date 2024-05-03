//Type casting long.
//Conversion of long to short, byte, int are examples of narrowing wherein higher type(long) is converted to
//lower types(byte, short, int).
//long to float, double is an example of widening wherein lower type is converted to a higher type.

package Ex_11042024;

public class Lab98_long_typecast {
    public static void main(String[] args) {

        //Narrowing example wherein lower type is converted to a higher type.
        long l1=1270;
        byte b1=(byte)l1;
        System.out.println(b1);

        //Narrowing example wherein lower type is converted to a higher type.
        long l2=30000;
        short s1=(short)l2;
        System.out.println(s1);

        //Narrowing example wherein lower type is converted to a higher type.
        long l3=89000;
        int i1=(int)l3;
        System.out.println(i1);

        //Widening example wherein lower type is converted to a higher type.
        long l4=123l;
        float f1=l4;
        System.out.println(l4);

        //Widening example wherein lower type is converted to a higher type.
        long l5=1234l;
        double d1=l5;
        System.out.println(d1);


    }

}
