/* There are several methods to print exception
1. You may write some statement inside catch
2. You may write sop(e): This will print the exception name and description.
3. You may write e.printStackTrace(): This will print the exception name, description+line number on which
exception occurred
4. You may write sop(e.toString()): This will print the exception name and description.
5. You may write sop(e.getMessage()): This will not print stack/exception name. Will print only description
*/
 
package OOPS.Exceptions;

public class LAb05_PrintException {
    public static void main(String[] args) {
        int a=100,b=0,c=0;
        try {
            c = a / b;
        }
        catch(Exception e) {
            System.out.println(e);
           /* e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());*/
        }
    }
}
