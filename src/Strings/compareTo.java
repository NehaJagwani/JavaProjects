package Strings;

public class compareTo {
    public static void main(String[] args) {
        String str1="Neha";
        String str2="Neha";
        String str3=new String("Neha");
        String str4=new String("Neha");

       //str1>str2 -> will return a positive value. ex: hello wello
        //str1==str2 -> will return 0
        //str1>str2 -> will return a negative value. ex: wello hello.
        if (str1.compareTo(str2)==0)
        {
            System.out.println("Strings are equal.");
        }
        else if (str1.compareTo(str2)>0)
        {
            System.out.println("String1 is greater than String2");
        } else if (str1.compareTo(str2)<0)
        {
            System.out.println("String1 is less than String2");
        }

        if(str1 == str2)
        {
            System.out.println("Strings are equal");
        }

        if(str3==str4)  //this code will not work.
        {
            System.out.println("Strings are equal");
        }

    }
}
