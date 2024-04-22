package Ex_11042024;

public class Lab56_Implicitcasting {
    public static void main(String[] args) {

        //byte+byte goes to int
        byte b1=40;
        byte b2=20;
        int b3=b1-b2;
        System.out.println(b3);

        //byte+float goes to float
        byte b4=50;
        float f1=10.0f;
        float f2=b4*f1;
        System.out.println(f2);

        //byte + short goes to int
        byte b5=10;
        short s1=40;
        int s2=b5*s1;
        System.out.println(s2);

        //short + short goes to int
        short s3=10;
        short s4=10;
        int s5=s3*s4;
        System.out.println(s5);

    }
}
