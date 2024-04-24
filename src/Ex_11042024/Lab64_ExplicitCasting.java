package Ex_11042024;

//Explicit casting is used when the higher data type needs to be converted to the lower data type.

public class Lab64_ExplicitCasting {
    public static void main(String[] args) {
        int i1=300;
        byte b1=(byte)i1;
        System.out.println(i1);

        int i2=300;
        float f1=(float)i1;
        System.out.println(f1);

        int i3=250;
        short s1=(short)i3;
        System.out.println(s1);

        int i4=567;
        double d1=(double)i4;
        System.out.println(d1);

        int i5=23112344;
        long l1=(long)i5;
        System.out.println(l1);

    }
}
