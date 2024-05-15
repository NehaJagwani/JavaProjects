package Strings;

public class Lab54_PrintWordsStartingwithR_WithoutUsingSplit {
    public static void main(String[] args) {
        String str1="This is Red Rubbish ";
        String str2="";
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
                str2=str2+ch;
            }
            else if (str2.startsWith("R")||str2.startsWith("r"))
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
