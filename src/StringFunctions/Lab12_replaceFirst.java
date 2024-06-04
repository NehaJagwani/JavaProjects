//replacefirst() will replace the first occurrence of the particular string
//Syntax: replaceFirst(String regex, String replacement)

package StringFunctions;

public class Lab12_replaceFirst {
    public static void main(String[] args) {
        String str1="This is demo";
        System.out.println(str1.replaceFirst("is", "was"));
    }
}
