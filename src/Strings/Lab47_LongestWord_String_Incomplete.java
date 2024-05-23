package Strings;

public class Lab47_LongestWord_String_Incomplete {
    public static void main(String[] args) {
        String str="This is Neha";
        String arr1[]=str.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i].length());
        }
    }
}
