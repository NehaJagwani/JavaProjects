//short data type's value range is -32768 to 32767 meaning it can contain only numbers like int data type.
//short variable starts with lowercase/uppercase alphabets, underscore and dollar sign.
//short variable does not start with an integer, also the variable cannot have space.
//After the first character, short variable can contain integers, lowercase/uppercase alphabets, underscore and dollar sign.
//Commented ones are not allowed.
package Ex_11042024;
public class Lab007_short {
    public static void main(String[] args) {
        short age1=-32768;
        short age_2= 32767;
        short A$1=456;
        short __=0;
        System.out.println(age1);
        System.out.println(age_2);
        System.out.println(A$1);
        System.out.println(__);
    }
}
