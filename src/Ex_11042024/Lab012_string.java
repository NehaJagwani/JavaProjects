//While defining string data type, the S has to be uppercase. It should be String and not string.
//Rules for String data type are the same as int, short, etc.
//%s is used for strings.
//The value for string has to be in double quotes
//if the value assigned to a string is null, it can either be "null" or null.
//Null can only be used for strings, classes, interface, arrays. This is 8 bytes.
package Ex_11042024;
public class Lab012_string {
    public static void main(String[] args) {
       String s1="neha";
       System.out.printf("My name is %s\n", s1);

       String s2=null;
       System.out.println(s2);

       String s3="null";
       System.out.printf("The string is %s", s3);

           }
}
