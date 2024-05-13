//Write a Java program to find the count of vowels, consonants in the string and print them.

package String_Again;
import java.util.Scanner;

public class Lab15_Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str1=sc.nextLine();

        int vowel=0;
        int consonants=0;
        String strVowel="";
        String strConsonant="";

        for (int i = 0; i < str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                if(ch==' ')
                {
                    continue;
                }
                vowel=vowel+1;
                strVowel=ch+strVowel;
            }
            else
            {
                if(ch==' ')
                {
                    continue;
                }
                consonants=consonants+1;
                strConsonant=strConsonant+ch;
            }
        }

        System.out.println("There are"+" "+vowel+" "+"vowels in the string and they are: "+strVowel);
        System.out.println("There are"+" "+consonants+" "+"consonants in the string and they are: "+strConsonant);

    }
}
