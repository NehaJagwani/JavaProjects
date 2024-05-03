//The range of short is -32768 to 32767. It can be converted to int, long, float, double provided
// the value has to be between -32768 to 32767. short cannot be typecasted to a character/string.
//short to byte conversion is an example of narrowing wherein higher type is converted to a lower type.
//short to int, float, double, long are all examples of widening wherein lower type is converted to a higher type.

package Ex_11042024;

public class Lab95_short_typecast {
    public static void main(String[] args) {

        //short to int conversion is an example of widening ex wherein lower type is converted to a higher type.
        short s1=30000;
        int i1=s1;
        System.out.println(i1);

        //short to byte conversion is an example of narrowing wherein higher type is converted to a lower type.
        short s2=120;
        byte b1=(byte)s2;
        System.out.println(b1);

        //short to float conversion is an example of widening wherein lower type is converted to higher type.
        short s3=32000;
        float f1=s3;
        System.out.println(f1);

        //short to long conversion is an example of widening wherein lower type is converted to higher type.
        short s4=30000;
        long l1=s4;
        System.out.println(l1);

        //short to double conversion is an example of widening wherein lower type is converted to a higher type.
        short s5=567;
        double d1=s5;
        System.out.println(d1);


    }
}
