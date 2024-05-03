package ForLoop;

public class diff_float_double_for {
    public static void main(String[] args) {
        //In float, if it's a decimal value, have to append 'f' in initialization. Appending 'f' in condition is
        // optional.
         for (float f1=10.5f;f1>8.5;f1--)
        {
            System.out.println(f1);
        }

         //In double, everything is allowed i.e. if it's a decimal value, you may/may not append 'd' in initialization
        //or condition. Even if it's not a decimal value, appending d in initialization and condition is optional.
        for (double d1=10.7d;d1>10;d1--)
        {
            System.out.println(d1);
        }

        for(double d2=10.7;d2>10d;d2--)
        {
            System.out.println(d2);
        }

        for (double d3=10.5;d3>6.5;d3--)
        {
            System.out.println(d3);
        }

        for (double d4=5;d4>4d;d4--)
        {
            System.out.println(d4);
        }

        for (double d5=5d;d5>4;d5--)
        {
            System.out.println(d5);
        }

        for (double d6=5d;d6>4d;d6--)
        {
            System.out.println(d6);
        }
    }
}
