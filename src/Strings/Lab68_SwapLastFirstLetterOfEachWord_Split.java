//Write a program to swap the first and lastchar of each word and just print the first and last char.

package Strings;

public class Lab68_SwapLastFirstLetterOfEachWord_Split {
    public static void main(String[] args) {
        String str1 = "This is Neha ";
        String arr1[] = str1.split(" ");


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length(); j++) {
                char firstChar=arr1[i].charAt(j);
                char lastChar=arr1[i].charAt(arr1[i].length()-1);
                char temp3=' ';
                temp3=firstChar;
                firstChar=lastChar;
                lastChar=temp3;
                System.out.print(firstChar);
                System.out.print(lastChar);
                break;
            }
            System.out.println();
        }
    }
}
