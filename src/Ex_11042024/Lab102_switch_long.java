//gets error that selector type float, double are not allowed.

package Ex_11042024;

public class Lab102_switch_long {
    public static void main(String[] args) {
        long l1=10;
    switch((byte)l1)
    {
        case 10:
            System.out.println("Long is able to convert to byte");
            break;
        default:
            System.out.println("Long is not able to convert to byte");
    }

        long l2=10;
        switch((short)l2)
        {
            case 10:
                System.out.println("Long is able to convert to short");
                break;
            default:
                System.out.println("Long is not able to convert to short");
        }

        long l3=10;
        switch((int)l3)
        {
            case 10:
                System.out.println("Long is able to convert to an integer");
                break;
            default:
                System.out.println("Long is not able to convert to an integer");
        }
/*
        long l4=10;
        switch((float)l4)
        {
            case 10:
                System.out.println("Long is able to convert to float");
                break;
            default:
                System.out.println("Long is not able to convert to float");
        }

        long l5=10;
        switch((double)l5)
        {
            case 10:
                System.out.println("Long is able to convert to double");
                break;
            default:
                System.out.println("Long is not able to convert to double");
        }*/
}
}
