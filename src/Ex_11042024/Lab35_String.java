package Ex_11042024;

public class Lab35_String {
    public static void main(String[] args) {
        String s1 = "Orange";
        String s2 = "orange";
        String s3 = new String("orange");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
    }
}
