//A string can be converted to a primitive data type using valueOf() of wrapper classes Integer,
//Float, Long & Double.

package Strings;

public class Lab37_ConvertStringPrimitiveType {
    public static void main(String[] args) {
        String str="34";
        System.out.println(Integer.valueOf("34"));
        System.out.println(Long.valueOf("34"));
        System.out.println(Float.valueOf("34"));
        System.out.println(Double.valueOf("34"));
    }
}
