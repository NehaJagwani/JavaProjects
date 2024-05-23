//Write a program to capitalize each word without using the Split method.

package Strings;

public class Lab64_CapitalizeEachWord_WithoutSplit {
    public static void main(String[] args) {
        String str1="This is Neha ";
        String str2="";
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
                str2=str2+ch;
            }
            else
            {
                System.out.println(str2.toUpperCase());
                str2="";
            }
        }
    }
}
