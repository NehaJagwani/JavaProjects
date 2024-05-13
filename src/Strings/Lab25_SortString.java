//For sorting strings, first convert the string to a character array.Then, use the function Arrays.sort().

package Strings;

import java.util.Arrays;

public class Lab25_SortString {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";

        //Converting strings to character array.
        char CharArray1[]=str1.toCharArray();
        char CharArray2[]=str2.toCharArray();

        //Sorting Arrays.
        Arrays.sort(CharArray1);
        Arrays.sort(CharArray2);

        System.out.print("Array1: ");
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(CharArray1[i]);
        }
        System.out.println();

        System.out.print("Array2: ");
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(CharArray2[i]);
        }
    }
}
