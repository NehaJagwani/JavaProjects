//Null can also be printed in a String array. While defining null, it is optional to give double quotes
//or not. Even space, can be printed as part of the string array.

package Arrays_1D;

public class Lab22_String_Array {
    public static void main(String[] args) {
        String arr1[]={"neha", " ", null};
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]);
        }
    }
}
