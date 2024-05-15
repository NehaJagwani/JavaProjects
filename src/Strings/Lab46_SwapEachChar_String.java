//Write a program to reverse each character. The same program can also be done using Lab45.
package Strings;

public class Lab46_SwapEachChar_String {
    public static void main(String[] args) {
        String str1="";
        String str2="This is Neha";
        for (int i = 0; i <str2.length() ; i++) {
            char ch=str2.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                str1 = str1 + Character.toLowerCase(ch);

            }
            else if(Character.isLowerCase(ch)==true)
            {
                str1=str1+Character.toUpperCase(ch);

            }
            else
            {
                str1=str1+ch;

            }
        }
        System.out.println(str1);
    }
}
