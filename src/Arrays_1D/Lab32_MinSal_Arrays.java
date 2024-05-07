package Arrays_1D;


public class Lab32_MinSal_Arrays {
    public static void main(String[] args) {

        int []sal={13,-4,5};
        int min= Integer.MAX_VALUE;
        for (int i=0;i<sal.length;i++)
        {
            if(sal[i]<min)
            {
                min=sal[i];
            }
        }
        System.out.println("The minimum salary is : " + min);
    }
}
