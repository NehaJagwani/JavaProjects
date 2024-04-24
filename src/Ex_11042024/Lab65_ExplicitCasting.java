package Ex_11042024;

public class Lab65_ExplicitCasting {
    public static void main(String[] args) {
        short s1=10;
        byte b1=(byte)s1;
        System.out.println(b1);

        int i1=125;
        byte b3 =(byte)i1;
        System.out.println(b3);

        byte b2=90;
        short s2=b2;
        System.out.println(s2);

        int i2=327688;
        short s3=(short)i2;
        System.out.println(s3);
    }
}
