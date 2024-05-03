//double and float works the same way in while also, same as int.
//for float, if the value is decimal, then need to append 'f' in the end during initialization. Optional to append
//'f' in the condition.
//for double, it is optional to append 'd' during initialization/condition.

package While_loop;

public class While_float_double {
    public static void main(String[] args) {
        float f1=5.5f;
        while (f1<=10.5)
        {
            System.out.println(f1);
            f1++;
        }

        double d1=10.9;
        while(d1>=5)
        {
            System.out.println(d1);
            d1--;
        }
    }
}
