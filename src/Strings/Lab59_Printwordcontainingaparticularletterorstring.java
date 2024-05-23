//Write a program to print a word containing a particular letter/string without using the split method.

package Strings;

public class Lab59_Printwordcontainingaparticularletterorstring {
    public static void main(String[] args) {
        String str1="Hi I am Neha ";
        String str2="";
        for (int i = 0; i < str1.length(); i++) {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
                str2=str2+ch;
            }
            else if(str2.contains("Ne"))
            {
                System.out.println("The string is " + str2);
                str2="";
            }
            else
            {
                str2="";
            }
        }
    }
}
