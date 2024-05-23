package Strings;

public class Lab60_PrintWordsContainingParticularLetterOrString_UsingSplit {
    public static void main(String[] args) {
        String str1="This is Neha";
        String arr1[]=str1.split(" ");
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i].contains("is"))
            {
                System.out.println("The string is " + arr1[i]);
            }
        }
    }
}
