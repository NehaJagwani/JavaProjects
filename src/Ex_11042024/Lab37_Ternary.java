package Ex_11042024;

public class Lab37_Ternary {
    public static void main(String[] args) {
        int i1=10;
        int i2=20;
        int max = i1<i2? i2:i1;
        int min=i1<i2?i1:i2;
        System.out.printf("The maximum value is %d.\n", max);
        System.out.printf("The minimum value is %d.", min);
    }
}
