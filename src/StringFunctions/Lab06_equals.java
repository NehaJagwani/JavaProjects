//equals() will check the contents and return the boolean value of True or False. It is case sensitive.

package StringFunctions;

public class Lab06_equals {
    public static void main(String[] args) {
        String str1="neha";
        String str2="neha";
        System.out.println(str1.equals(str2));

        String str3="Neha";
        String str4="NEHA";
        System.out.println(str3.equals(str4));
    }
}
