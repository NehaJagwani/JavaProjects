//There are 6 ways to create String constructors
package StringFunctions;

public class Lab02_StringConstructors {
    public static void main(String[] args) {

        //Method1: This will create an empty string.
        String str1=new String();
        System.out.println(str1);

        //Method2:
        String str2=new String("Neha");
        System.out.println(str2);

        //Method3
        StringBuffer sb=new StringBuffer("Neha");
        String str3=new String(sb);
        System.out.println(str3);

        //Method4:
        StringBuilder sb1=new StringBuilder("Neha");
        String str4=new String(sb1);
        System.out.println(str4);

        //Method4:
        char arr1[]={'N', 'E', 'H', 'A'};
        String str5=new String(arr1);
        System.out.println(arr1);

        //Method4:
        byte b[]={101, 102, 103};
        String str6=new String(b);
        System.out.println(str6);
    }
}
