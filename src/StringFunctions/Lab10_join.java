//join is a static method, hence, it can be called directly by using the String class name.
//Remember that String is also a class in Java.

package StringFunctions;

public class Lab10_join {
    public static void main(String[] args) {

        //join is a static method, can be called directly by using the String class.
        String str1=String.join("->","Eat", "Sleep", "Repeat");
        System.out.println(str1);

        //join() can also be called by using an object reference.
        String str7=new String();
        System.out.println(str7.join("->", "Kyra", "P"));
    }
}
