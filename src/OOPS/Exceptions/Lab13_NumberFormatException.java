/*Create a program that reads an integer from the user and handles a NumberFormatException if
the input cannot be parsed as an integer.
*/

package OOPS.Exceptions;

public class Lab13_NumberFormatException {
    public static void main(String[] args) {
        String s = "Neh";
        try {
            int n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
