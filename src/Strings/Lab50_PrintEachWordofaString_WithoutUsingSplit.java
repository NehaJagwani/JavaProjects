//Print each word of a string in a seperate line. Can do the same program using split method also which is
//program Lab22.

package Strings;

public class Lab50_PrintEachWordofaString_WithoutUsingSplit {
    public static void main(String[] args) {
        String str1="I am Neha ";
        String str2="";
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
                str2=str2+ch;
            }
            else
            {
                System.out.println(str2);
                str2="";
            }
        }

    }
}
