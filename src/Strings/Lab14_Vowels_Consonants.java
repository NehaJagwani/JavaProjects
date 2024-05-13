package Strings;
import java.util.Scanner;

public class Lab14_Vowels_Consonants {
    public static void main(String[] args) {
        int vowel=0, consonant=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str1=sc.nextLine();

        String str2="";
        String str3="";

        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                if(ch == ' ') {
                    continue;
                }
                vowel=vowel+1;
                str2=str2+ch;
            }
            else
            {
                if(ch ==' ') {
                    continue;
                }
                consonant=consonant+1;
                str3=str3+ch;
            }
        }
        System.out.println("The number of vowels in the String are: "+vowel);
        System.out.println("The number of consonants in the String are: "+consonant);

        System.out.print("The vowels in the String are :");
        for (int i = 0; i <str2.length() ; i++) {
            System.out.print(str2.charAt(i)+",");
        }
        System.out.println();

        System.out.print("The consonants in the String are :");
        for (int i = 0; i <str3.length() ; i++) {
            System.out.print(str3.charAt(i)+",");
        }
    }
}

