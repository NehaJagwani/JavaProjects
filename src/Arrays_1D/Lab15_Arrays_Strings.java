//Difference in == & .equals() function for Array and String.
//In String, == will check for the reference while .equals() checks for the values.
//in Array, == and .equals both checks for the reference.
//== and .equals() both return the boolean values i.e. true / false.

package Arrays_1D;

public class Lab15_Arrays_Strings {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int []arr2={1,2,3,4,5};

        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
    }
}
