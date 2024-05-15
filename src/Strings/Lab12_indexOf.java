//indexOf() returns an integer.

package Strings;

public class Lab12_indexOf {
    public static void main(String[] args) {
        String str1="neha is a good girl, ok neha";
        System.out.println(str1.indexOf("neha"));

        //Another way, pass string and int as a parameter.
        String str2="This is a String.";
        int i2=str2.indexOf("is", 4);
        System.out.println(i2);

        //If you pass int as a parameter, it will always return you -1.
        String str3="This is a String";
        int i3=str3.indexOf(6);
        System.out.println(i3);

    }
}
