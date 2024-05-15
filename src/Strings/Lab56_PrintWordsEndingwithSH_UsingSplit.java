//Write a Java program to print the words ending with sh using the split method.

package Strings;

public class Lab56_PrintWordsEndingwithSH_UsingSplit {
    public static void main(String[] args) {
        String str1="I amish Kyrish";
        String str2="";
        String arr1[]=str1.split(" ");
        for (int i = 0; i < arr1.length ; i++) {
            if(arr1[i].endsWith("sh"))
            {
                System.out.println(arr1[i]);
            }
        }
    }
}
