//for loop accepts only numericals. If you want to use char in for loop, use below.
//cannot write (ch=='x') or for(ch). should write (ch='x').

package ForLoop;

public class For_Char {
    public static void main(String[] args) {
        char ch='x';
        int i=1;
        for(ch='x';i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
