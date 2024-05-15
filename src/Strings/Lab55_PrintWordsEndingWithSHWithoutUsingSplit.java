//Neha to try this using both the split method and the alternate method.

package Strings;

public class Lab55_PrintWordsEndingWithSHWithoutUsingSplit {
    public static void main(String[] args) {
        String str1=" This issh Nehaish ";
        String str2="";
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
                str2=str2+ch;

            } else if (str2.endsWith("sh"))
            {
                System.out.println(str2);
                str2="";
            }
            else
            {
                str2="";
            }

        }
    }
}
