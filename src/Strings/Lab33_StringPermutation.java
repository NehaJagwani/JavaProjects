//Write a Java program to find permutations of a given string.

package Strings;

public class Lab33_StringPermutation {
    public static void main(String[] args) {
        String str="ABC";
        printPermutation(str,"",0);
    }

    static void printPermutation(String str, String perm, int index) {
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newstr, perm+currChar, index+1);
        }
    }
}
