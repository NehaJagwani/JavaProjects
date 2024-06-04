package StringFunctions;

public class Lab20_subString {
    public static void main(String[] args) {
        String str1="Neha Jagwani";
        System.out.println(str1.substring(0)); //will return Neha Jagwani
        System.out.println(str1.substring(2)); //will return ha Jagwani
        System.out.println(str1.substring(0, 5)); //will return Neha
        System.out.println(str1.substring(0,6)); //will return Neha J
        System.out.println(str1.substring(0,12)); //will return Neha Jagwani
        System.out.println(str1.substring(1,2));//will return e
    }
}
