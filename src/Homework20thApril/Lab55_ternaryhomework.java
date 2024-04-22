package Homework20thApril;

public class Lab55_ternaryhomework {
    public static void main(String[] args) {

        int i1=25000;
        int i2=67;
        int i3=7900;

        int i4=i1>i2?i1:i2;
        int i5=i3>i4?i3:i4;

        System.out.printf("The max number between i1,i2,i3 is %d", i5);
    }
}
