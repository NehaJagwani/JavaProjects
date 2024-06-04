//replaceAll works with regex.
//Syntax: replaceAll(String regex, String replacement)

package StringFunctions;

public class Lab13_replaceAll {
    public static void main(String[] args) {
        String str1="This is demo";
        System.out.println(str1.replaceAll("is", "was"));
        System.out.println(str1.replaceAll("is(.)","was"));
        System.out.println(str1.replaceAll("is(.*)","was"));
    }
}
