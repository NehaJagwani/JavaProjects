//Gets error that selector type long, double are not allowed.
package Ex_11042024;

public class Lab103_float_switch {
    public static void main(String[] args) {
        float f1=10f;
        switch ((byte)f1)
        {
            case 10:
                System.out.println("Float is able to convert to byte");
                break;
            default:
                System.out.println("Float is not able to convert to byte");
        }

        float f2=123;
        switch((short)f2)
        {
            case 123:
                System.out.println("Float is able to convert to short");
                break;
            default:
                System.out.println("Float is not able to convert to short");
        }

        float f3=123;
        switch((int)f3)
        {
            case 123:
                System.out.println("Float is able to convert to an integer");
                break;
            default:
                System.out.println("Float is not able to convert to an integer");
        }
/*
        float f4=123;
        switch((long)f4)
        {
            case 123:
                System.out.println("Float is able to convert to long");
                break;
            default:
                System.out.println("Float is not able to convert to long");
        }

        float f5=123;
        switch((double)f5)
        {
            case 123:
                System.out.println("Float is able to convert to double");
                break;
            default:
                System.out.println("Float is not able to convert to double");
        }
*/


    }
}
