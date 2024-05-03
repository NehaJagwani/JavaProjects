//This will not print anything, will return ext code 0.
//can write (b1=true) or (b1==true)

package While_loop;

public class While11_boolean {
    public static void main(String[] args) {
        //this will not print anything, exit code 0 will be printed.
        boolean b1=true;
        while(b1==false)
        {
            System.out.println("This will not print anything");
        }
    }
}
