//For will accept only numerical values. If you want to use string in for loop, see below.
//cannot write (s1=="neha") or for(s1) Have to write (s1="neha").

package ForLoop;

public class For_String {
    public static void main(String[] args) {
        String s1="neha";
        int i=1;
        for (s1="neha"; i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
