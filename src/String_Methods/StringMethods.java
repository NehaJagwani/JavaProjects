package String_Methods;

public class StringMethods {
    public static void main(String[] args){

        //charat function
        String s1="Neha";
       // char ch=s1.charAt(1);
        System.out.println(s1.charAt(2));

        //substring: Return a sequence of characters from a string.
        String s2="Neha Jagwani";
       // String s3=s2.substring(1,4);
        System.out.println(s2.substring(0,12));

        //tolowercase
        String s3="KYRA";
        System.out.println(s3.toLowerCase());

        //touppercase
        String s4="kyra";
        System.out.println(s4.toUpperCase());

        //trim : removes whitespace from both the ends of the string.
        String s5="    Kyra";
        System.out.println(s5.trim());

        //toString: it returns the string itself
        String s6="Kyra Jagwani";
        System.out.println(s6.toString());

        //subsequence: it returns the subsequence from the string as a CharSequence object.
        String s7="Neha Jagwani";
        System.out.println(s7.subSequence(0,9));

        //concat: Append a string to the end of another string.
        String s8="Neha";
        String s9=" Jagwani";
        System.out.println(s8.concat(s9));

        System.out.println("neha". concat("jagwani"));
    }
}
