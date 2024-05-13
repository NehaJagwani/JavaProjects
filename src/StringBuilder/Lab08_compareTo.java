package StringBuilder;

public class Lab08_compareTo {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Raghu");
        StringBuilder sb2=new StringBuilder("Neha");
        if(sb1.compareTo(sb2)==0)
        {
            System.out.println("Strings are equal.");
        } else if (sb1.compareTo(sb2)>0) {
            System.out.println("String1 is greater than String2");
        } else if (sb1.compareTo(sb2)<0) {
            System.out.println("String1 is less than String2");
        }
    }
}
