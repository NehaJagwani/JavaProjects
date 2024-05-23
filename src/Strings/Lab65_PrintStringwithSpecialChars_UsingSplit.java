//Write a program to print the words containing special characters ($ & @) using the split method.

package Strings;

public class Lab65_PrintStringwithSpecialChars_UsingSplit {
    public static void main(String[] args) {
        String str1="T$his$ is@ Neha";
        String arr1[]=str1.split(" ");
        System.out.println("The words containing special charcters are: ");
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length() ; j++) {
                char ch1 = arr1[i].charAt(j);
                int i1 = (int) ch1;
                if (i1 == 36 || i1 == 64) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
