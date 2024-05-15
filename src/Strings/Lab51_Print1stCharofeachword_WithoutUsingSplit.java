//Write a program to print only the first character of each word in a string.
//Below program shows to do this without using the split method.

package Strings;

public class Lab51_Print1stCharofeachword_WithoutUsingSplit {
    public static void main(String[] args) {
        String str1 = "I am Raghu";
        boolean newWord=true;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != ' '&& newWord==true) {
                System.out.print(ch);
                newWord=false;
            } else if(ch==' ')
            {
                newWord=true;
            }
        }
    }
}


