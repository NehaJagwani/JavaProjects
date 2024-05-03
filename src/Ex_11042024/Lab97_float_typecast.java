//Type casting for float.
//Float to byte, short, int, long happens through narrowing wherein higher type is converted to a lower type.
//Float to double happens through widening wherein lower type is converted to a higher type.

package Ex_11042024;

public class Lab97_float_typecast {
    public static void main(String[] args) {

        //Narrowing example wherein higher type is converted to a lower type. It works. The ans is -9.
        float f1=1271;
        byte b1=(byte)f1;
        System.out.println(b1);

        //Narrowing example wherein higher type is converted to a lower type. It works. The ans is -7680.
        float f2=320000;
        short s1=(short)f2;
        System.out.println(s1);

        //Narrowing example wherein higher type is converted to a lower type. It works. The ans is 1290.
        float f3=1290.7f;
        int i1=(int)f3;
        System.out.println(i1);

        //Narrowing example wherein higher type is converted to a lower type. It works. The ans is 123.
        float f4=123f;
        long l1=(long)f4;
        System.out.println(l1);

        //Widening example wherein lower type is converted to a higher type. It works. The ans is 1234.0.
        float f5=1234;
        double d1=f5;
        System.out.println(d1);
    }
}
