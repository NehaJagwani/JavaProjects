package Arrays_1D;

public class Lab20_Arrays_Diffdatatypes {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        byte arr2[]={4,5,6};
        short arr3[]={7,8,9};
        float arr4[]={1.1f, 2.3f, 4.5f};
        double arr5[]={2.3,4.5};
        long arr6[]={9823114288l,2};
        char arr7[]={'n','e','h','a'};
        boolean arr8[]={true,false};
        String arr9[]={"Neha", "Peehu", "Raghu"};

        System.out.print("The integer values are: ");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("The byte values are: ");
        for (int j=0;j<arr2.length;j++)
        {
            System.out.print(arr2[j]);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("The short values are: ");
        for (int k = 0; k <arr3.length ; k++) {
            System.out.print(arr3[k]);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("The float values are: ");
        for (int l = 0; l <arr4.length ; l++) {
            System.out.print(arr4[l]);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("The double values are: ");
        for (int m = 0; m <arr5.length ; m++) {
            System.out.print(arr5[m]);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("The long values are: ");
        for (int n = 0; n <arr6.length ; n++) {
            System.out.print(arr6[n]);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("The character values are: ");
        for (int o=0;o<arr7.length;o++)
        {
            System.out.print(arr7[o]);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("The boolean values are: ");
        for (int p=0;p<arr8.length;p++)
        {
            System.out.print(arr8[p]);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println();

        System.out.print("The string values are: ");
        for (int q=0;q<arr9.length;q++)
        {
            System.out.print(arr9[q]);
            System.out.print(",");
            System.out.print(" ");
        }

    }
}
