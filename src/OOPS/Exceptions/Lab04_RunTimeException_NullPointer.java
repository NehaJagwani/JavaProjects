//Unchecked Exception i.e. RunTime Exception: NuLLPointerException

package OOPS.Exceptions;

public class Lab04_RunTimeException_NullPointer {
    public static void main(String[] args) {
        String name=null;
        try {
            System.out.println(name.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
