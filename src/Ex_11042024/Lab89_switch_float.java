//Float data type is convereted to an Integer, Short, Byte.

package Ex_11042024;

public class Lab89_switch_float {
    public static void main(String[] args) {
        float f=123.3f;
        switch((int)f)
        {
            case 123:
                System.out.println("Float is converted to an Integer");
                break;
            default:
                System.out.println("Float is not able to convert to an Integer");
        }

        float f2=123.5f;
        switch((short)f2)
        {
            case 123:
                System.out.println("Float is converted to Short");
                break;
            default:
                System.out.println("Float cannot be converted to Short");
        }

        float f3=-128.9f;
        switch((byte)f3)
        {
            case -128:
            System.out.println("Float is converted to Byte");
            break;
            default:
                System.out.println("Float cannot be converted to Byte");
        }

       /* float f4=2345;
        switch((long)f4)
        {
            case 2345:
                System.out.println("Float can be converted to Long");
                break;
            default:
                System.out.println("Float cannot be converted to Long");
        }*/
    }
}
