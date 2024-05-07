//In below program, size of the array is 3. However, only 2 values are defined.
//Hence, for the third value, nothing will be printed. (in string->null is printed. for integer->0 is printed).

package Arrays_1D;

public class Lab28_BooleanArray {
    public static void main(String[] args) {
        boolean arr1[]=new boolean[3];
        arr1[0]=true;
        arr1[1]=false;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
    }
}
