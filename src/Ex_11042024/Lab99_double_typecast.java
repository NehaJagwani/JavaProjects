//Type cast to double.
//Type casting from double to (byte, short, int, float, long) are all narrowing wherein higher type is converted to
//a lower type.

package Ex_11042024;

public class Lab99_double_typecast {
    public static void main(String[] args) {

        //Narrowing example wherein higher type is converted to a lower type.
        double d1=12700;
        byte b1=(byte)d1;
        System.out.println(b1);

        //Narrowing example wherein higher type is converted to a lower type.
        double d2=12700;
        short s1=(short)d2;
        System.out.println(s1);

        //Narrowing example wherein higher type is converted to a lower type.
        double d3=1000.8;
        int i1=(int)d3;
        System.out.println(i1);

        //Narrowing example wherein higher type is converted to a lower type.
        double d4=123.8d;
        float f1=(float)d4;
        System.out.println(f1);

        //Narrowing example wherein higher type is converted to a lower type.
        double d5=982311;
        long l1=(long)d5;
        System.out.println(l1);
    }
}
