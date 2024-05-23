//Write a program to swap the first and last digit of each word in the string.

package Strings;

public class Lab69_SwapFirstLastCharOfEachWord {
    public static void main(String[] args) {
        String str1 = "This is Neha";
        String arr1[] = str1.split(" ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length() > 1) {
                char firstChar = arr1[i].charAt(0);
                char lastChar = arr1[i].charAt(arr1[i].length() - 1);
                arr1[i] = lastChar + arr1[i].substring(1, arr1[i].length() - 1) + firstChar;
            }
        }

            for (int j = 0; j < arr1.length; j++) {
                System.out.println(arr1[j]);
            }
    }
}

