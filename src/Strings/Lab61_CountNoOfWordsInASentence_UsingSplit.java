//Write a program to find number of words in Java.

package Strings;

public class Lab61_CountNoOfWordsInASentence_UsingSplit {
    public static void main(String[] args) {
        String str1 = "This is Neha Jagwani";
        String arr1[] = str1.split(" ");
        System.out.println("The number of words in this sentence are "+arr1.length);
    }
}
