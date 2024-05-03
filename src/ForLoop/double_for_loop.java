//using double in for loop: double will always return a decimal value even though the value mentioned is
//without a decimal point.
//In double, everything is allowed i.e. you can use 'd' in initialization and not in condition or vice-versa.
//In double, can use 'd' in both condition and initialization, can even skip using 'd' in either.

package ForLoop;

public class double_for_loop {
    public static void main(String[] args) {

        //Allowed.
         for (double d1 = 5.5; d1<=10 ; d1++)
        {
            System.out.println(d1);
        }

        //Allowed. Not using 'd' in either condition & initialization.
        for(double d2=5;d2>1;d2--)
        {
            System.out.println(d2);
        }

        //Allowed. using the char 'd' in initialization and not in condition.
        for (double d3=5.9d;d3<=10;d3++)
        {
            System.out.println(d3);
        }

        //Allowed, using 'd' in condition and not in initialization.
        for(double d4=10;d4>5.5d;d4--)
        {
            System.out.println(d4);
        }


       //Allowed, using 'd' in both the condition and initialization.
        for (double d5=12.5d;d5>=1.5d;d5--)
        {
            System.out.println(d5);
        }
    }
}
