//Write a program to print words starting with R using the split method.

package Strings;

public class Lab53_PrintWordsStartingwithR_SplitMethod {
    public static void main(String[] args) {
        String str1 = "A Red Rubbish ";
        String arr1[]=str1.split(" ");
        for (int i = 0; i <arr1.length ; i++) {
            char ch=arr1[i].charAt(0);
            if(ch=='r' || ch == 'R')
            {
                System.out.println(arr1[i]);
            }
        }
    }
}



