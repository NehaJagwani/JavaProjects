package Arrays;

public class Lab19_PrintArray_doWhileLoop {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int i=0;
        do {
            System.out.println(arr1[i]);
            i++;
        }while(i<arr1.length);
    }
}
