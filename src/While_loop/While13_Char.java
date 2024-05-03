//Rules for char and string are same in while loop.
//Can write while(ch=='x') but the character will be printed infinite number of times.
//Cannot write while(ch='x') or while(ch)

package While_loop;

public class While13_Char {
    public static void main(String[] args) {
        char ch='x';
        while(ch=='x')
        {
            System.out.println(ch);
        }
    }
}
