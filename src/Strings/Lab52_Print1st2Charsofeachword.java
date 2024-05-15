package Strings;

public class Lab52_Print1st2Charsofeachword {
    public static void main(String[] args) {
    /*    String str1="This hii Neha";
        String str2="";
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
                str2=str2+ch;
            }
            else
            {
                System.out.print(str1.substring(0,2));
                str2="";
            }
        }*/

        //This is how you print the first 2 characters of each word using the split method.
        String str1="This is Neha";
        String arr1[]=str1.split(" ");
        String str2="";
        for (int i = 0; i <arr1.length ; i++) {
            str2=arr1[i].substring(0,2);
            System.out.println(str2);
        }
    }
}
