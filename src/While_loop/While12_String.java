//Rules for char and string are same in while loop.
//While(s1=="neha") is good. It will accept two =. but the statement will be printed infinite number of times.
//while(s1="neha") or while(s1) is not accepted.


package While_loop;

public class While12_String {
    public static void main(String[] args) {
        String s1="neha";
        while (s1=="neha")
        {
            System.out.println("I am Neha");
        }

    }
}
