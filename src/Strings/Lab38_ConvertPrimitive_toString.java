//Primitive data types such as integer, float, long and double can also be converted to a String data type
//using the function String.valueOf().

package Strings;

public class Lab38_ConvertPrimitive_toString {
    public static void main(String[] args) {
        String s1=String.valueOf(true);
        System.out.println(s1);

        String s2=String.valueOf(34);
        System.out.println(s2);

        String s3=String.valueOf('a');
        System.out.println(s3);

        String s4=String.valueOf(20.2);
        System.out.println(s4);
    }
}
