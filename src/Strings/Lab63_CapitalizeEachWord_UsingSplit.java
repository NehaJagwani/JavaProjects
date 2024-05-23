//Write a program to capitalize each word in a sentence using the split method.

package Strings;

public class Lab63_CapitalizeEachWord_UsingSplit {
    public static void main(String[] args) {
        String str1="This is Neha";
        String arr1[]=str1.split(" ");
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length() ; j++) {
                char ch = arr1[i].charAt(j);
                System.out.print(Character.toUpperCase(ch));
            }
            System.out.println();
        }
    }
}
