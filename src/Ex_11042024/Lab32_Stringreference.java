package Ex_11042024;

public class Lab32_Stringreference {
    public static void main(String[] args) {
        String s1 = new String("neha");
        String s2 = new String("neha");

        String s3="neha";
        String s4="neha";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}
