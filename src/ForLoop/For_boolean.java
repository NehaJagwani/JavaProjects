//boolean will not work in for loop. If you want to make boolean in for loop, use below.
//cannot write (b1==true) or for(b1). have to write for(b1=true).

package ForLoop;

public class For_boolean {
    public static void main(String[] args) {
        boolean b1=true;
        int b2=1;
        for(b1=true;b2<=5;b2++)
        {
            System.out.println(b2);
        }
    }
}
