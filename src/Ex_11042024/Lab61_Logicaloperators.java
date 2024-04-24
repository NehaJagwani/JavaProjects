package Ex_11042024;    //Logical operators are &&, ||, !

public class Lab61_Logicaloperators
{
    public static void main(String[] args)
    {
        int i1=10;
        int i2=10;

        System.out.println(i1==10&&i2==10); //T&&T=T
        System.out.println(i1==10&&i2!=10); //T&&F=F
        System.out.println(i1!=10&&i2==10); //F&&T=F
        System.out.println(i1!=10&&i2!=10); //F&&F=F

        System.out.println();

        System.out.println(i1==10||i2==10); //T||T=T
        System.out.println(i1==10||i2!=10); //T||F=T
        System.out.println(i1!=10||i1==10); //F||T=T
        System.out.println(i1!=10||i2!=10); //F||F=F

    }
}
