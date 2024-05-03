//The range of byte is -128 to 127. It can be converted to int, long, short, float, double provided
// the value has to be between -128 to 127. byte cannot be typecasted to a character/string.
//Below is all widening meaning the process of converting lower type to higher type.

package Ex_11042024;

public class Lab94_byte_typecast {
    public static void main(String[] args) {
        byte b1=127;
        int i1=b1;
        System.out.println(i1);

        //this is not allowed because 167 exceeds the range of byte which is -128 to 127.
        /*byte b2=167;
        int i2=(int)b2;
        System.out.println(i2);*/

        byte b3=100;
        short s1=b3;
        System.out.println(s1);

        byte b4=100;
        float f1=b4;
        System.out.println(f1);

        byte b5=100;
        double d1=b5;
        System.out.println(d1);

        byte b6=90;
        long l1=b6;
        System.out.println(l1);

        /*byte cannot be type casted to a character.
        byte b7=1;
        char ch=b7;
        System.out.println(ch);*/

    }
}
