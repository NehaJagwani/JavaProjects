/*Character.valueOF() takes only a character*/

package WrapperClasses;

public class Lab11_CharactervalueOf {
    public static void main(String[] args) {
        System.out.println(Character.valueOf('c'));
        System.out.println(Character.valueOf('1'));

        /*Below is not allowed
        System.out.println(Character.valueOf("Neha"));
        System.out.println(Character.valueOf(1));*/
    }
}
