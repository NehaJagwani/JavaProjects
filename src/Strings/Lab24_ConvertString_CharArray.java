//A string can be converted to a CHar Array using the function toCharArray present in the string class.

package Strings;

public class Lab24_ConvertString_CharArray {
    public static void main(String[] args) {
        String str1="I am Neha";
        char charArray[]=str1.toCharArray();

        for (int i = 0; i <charArray.length ; i++) {
            System.out.println(charArray[i]);
        }
    }
}
