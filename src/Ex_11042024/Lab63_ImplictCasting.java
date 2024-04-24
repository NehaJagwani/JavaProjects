package Ex_11042024;

//Implicit casting->Means lower data type can be converted to higher data type.
//byte can be converted to int, short, float, long, double.
//byte cannot be converted to char/String.

public class Lab63_ImplictCasting {
    public static void main(String[] args) {

        byte b1=10;
        int i1=b1;
        System.out.println(i1);

        byte b2=20;
        short s1=b2;
        System.out.println(s1);

        byte b3=20;
        float f1=b3;
        System.out.println(f1);

        byte b4=2;
        double d1=b4;
        System.out.println(d1);

        byte b5=90;
        long l1=b5;
        System.out.println(l1);

    }
}
