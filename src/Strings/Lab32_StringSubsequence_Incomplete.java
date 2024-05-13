package Strings;

public class Lab32_StringSubsequence_Incomplete {
    public static void main(String[] args) {
        String str="abc";
        System.out.println("The substrings are: ");
        for (int i = 0; i <=str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.println(str.subSequence(i,j));
            }
        }
    }
}
