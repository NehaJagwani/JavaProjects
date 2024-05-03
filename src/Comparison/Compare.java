//here comparison is verified in SOP statement.
//String cannot be compared to char and vice-versa.
//Int, long, float, double, short, byte can be compared to amongst each other.
//Comparison will always return either true/false.
//boolean can be compared to itself.

package Comparison;

public class Compare {
    public static void main(String[] args) {
        int x=12;
        int y=12;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<=y);
        System.out.println(x>=y);

        int x1=12;
        float f=12.3f;
        System.out.println(x1==f);
        System.out.println(x1<f);

        boolean b1=true;
        boolean b2=false;
        System.out.println(b1==b2);

        String str1="neha";
        String str2="neha";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        /*cannot compare string and character.
        String str="n";
        char ch='n';
        System.out.println(str==ch);*/

        char ch1='c';
        char ch2='c';
        System.out.println(ch1==ch2);

        long l1=982311;
        int i=982311;
        System.out.println(l1==i);


    }
}
