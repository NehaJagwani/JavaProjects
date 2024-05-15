//Write a program to print the first character of each word using split method.
package Strings;

public class Lab52_Print1stCharofeachword_UsingSplit {
    public static void main(String[] args) {
        String str1="This is Neha";
        String arr1[]=str1.split(" ");
        for (int i = 0; i <arr1.length ; i++) {
            char ch=arr1[i].charAt(0);
            System.out.println(ch);
        }
    }
}
