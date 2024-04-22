package Ex_11042024;

public class Lab18_arithmeticoperators {
    public static void main(String[] args) {
        int i1=10;
        int i2=20;
        int i3=30;

        //ok.
        System.out.println(i2+i1-i3);

        //here, division happens first, then subtraction. follow BODMAS.
        System.out.println(i2-i1/10);
        System.out.println(i2*i1);
        System.out.println(i2/i1);
        System.out.println(i2%i1);
    }

}
