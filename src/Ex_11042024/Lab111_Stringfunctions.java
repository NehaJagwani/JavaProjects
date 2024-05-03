package Ex_11042024;

import java.util.Scanner;

public class Lab111_Stringfunctions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd string: ");
        String str2=sc.nextLine();
        String str3=str1.concat(str2);
        //String str3="Neha Jagwani";*/
        System.out.println(str3.substring(0,8));
        System.out.println(str3.toLowerCase());

        //Trim removes whitespace from both the sides of the string.
        String str4="     hello world    ";
        System.out.println(str4.trim());

        String str5="Neha Jagwani";
        System.out.println(str5.length());

        String str6="hello world!";
        System.out.println(str6.replace('h','n'));

        //charat():Returns the specified character of the string
        String str7="Neha Jagwani";
        System.out.println(str7.charAt(11));

        //toString() returns the string itself
        String str8="hello world?";
        System.out.println(str8.toString());

        //toUpperCase() converts the string in uppercase characters
        String str9="convert to uppercase";
        System.out.println(str9.toUpperCase());

        //toLowerCase() converts the string in uppercase characters
        String str10="CONVERT TO LOWERCASE";
        System.out.println(str10.toLowerCase());

        //contains()find out if a string contains a sequence of characters.
        String str11="Hello World";
        System.out.println(str11.contains("He"));
        System.out.println(str11.contains("li"));

        //equals compares strings to find out if they are equal.
        String str12="hello";
        String str13="hello";
        System.out.println(str12.equals(str13));
        System.out.println(str12.equals(str11));

        //isEmpty find out if a string is empty or not. There has to be no space.
        String str14="";
        System.out.println(str14.isEmpty());


    }
}
