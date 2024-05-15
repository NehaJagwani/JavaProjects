//\n, \t, \r, \f are also considered as white spaces.
//\b is not considered as a white space.
package Char;

public class Lab21_isWhiteSpace {
    public static void main(String[] args) {

        //these all are considered as white spaces, hence, the answer will be true.
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isWhitespace('\r'));
        System.out.println(Character.isWhitespace('\f'));


        //the answer will be false as \b is not considered as a white space.
        System.out.println(Character.isWhitespace('\b'));

        //this will be false ofcourse.
        System.out.println(Character.isWhitespace('c'));


    }
}
