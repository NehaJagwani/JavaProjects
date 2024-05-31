//The valueOf() is present in all wrapper classes.

package WrapperClasses;

public class Lab12_valueOf {
    public static void main(String[] args) {
        System.out.println(Float.valueOf(123.4f));
        System.out.println(Float.valueOf("123"));

        System.out.println(Double.valueOf(123.4));
        System.out.println(Double.valueOf("123.56"));

        System.out.println(Long.valueOf(9823114288l));
        System.out.println(Long.valueOf("123"));

        System.out.println(Short.valueOf("123"));
    }
}
