//Write  a program to count number of words in a sentence without using the split method.

package Strings;

public class Lab62_CountNoOfWordsInASentence_WithoutSplit {
    public static void main(String[] args) {
        String str1="This is Neha Jagwani ";
        String str2="";
        int count=0;
        for (int i = 0; i < str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
                str2=str2+ch;
            }
            else
            {
                count = count+1;
            }
        }
        System.out.println("The number of words in this string are " + count);
    }
}
