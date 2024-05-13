//Remove the duplicates in a string.

package Strings;

public class Lab28_DuplicateStrings {
    public static void main(String[] args) {
        String str1="Hello World";
        String result="";
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result=result+ch;
            }
        }
        System.out.println("The string after removing the duplicates is: "+result);
    }
}
