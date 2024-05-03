//Type casting example of Integer. Int to byte, short are narrowing wherein higher type is converted to lower
//type. Rest are widening wherein lower type(int) is converted to higher type(float, long, double).

package Ex_11042024;

public class Lab96_int_typecast {
    public static void main(String[] args) {

            //Narrowing example wherein higher type is converted to a lower type. Below works, the answer is 48.
            int i1=30000;
            byte b1=(byte)i1;
            System.out.println(b1);

            //Narrowing example wherein higher type is converted to a lower type.Below works, the answer is -20536.
            int i2=45000;
            short s1=(short)i2;
            System.out.println(s1);

            //Widening example wherein lower type is converted to a higher type.
            int i3=45000999;
            float f1=i3;
            System.out.println(f1);

            //Widening example wherein lower type is converted to a higher type.
            int i4=982311428;
            long l1=i4;
            System.out.println(l1);

            //Widening example wherein lower type is converted to a higher type.
            int i5=982311428;
            double d1=i5;
            System.out.println(d1);

    }
}
