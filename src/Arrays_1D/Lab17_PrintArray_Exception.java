//After printing the array values, system will throw ArrayIndexOutOfBoundsException since
//i<=arr1.length is mentioned. For an array, it should be always <arr1.length and not <=.

package Arrays_1D;

public class Lab17_PrintArray_Exception {
    public static void main(String[] args) {
        int arr1[]={10,20,30};
        for(int i=0;i<=arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
