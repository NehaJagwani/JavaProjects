package Ex_11042024;

public class Lab87_switch_short_byte {
    public static void main(String[] args) {

    byte b = 123;
    switch(b)
    {
        case 123:
            System.out.println("Yes, am a byte");
            break;
        default:
            System.out.println("Am not a byte");
    }

    short sal=100;
    switch(sal)
    {
        case 100:
            System.out.printf("MY salary is %d\n", sal);
            break;
        default:
            System.out.println("My sal is great");
    }


}
}
