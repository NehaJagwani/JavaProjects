//Program to print table of 5.
package ForLoop;

public class Table_of_5 {
    public static void main(String[] args){

        //Method1
        int num=0;
        for(int i=1;i<=10;i++)
        {
            num=num+5;
            System.out.println("5"+"*"+i+"="+num);
        }

        //Method2
        int num1=5;
        for (int i = 1; i <=10 ; i++)
        {
            System.out.println(num1 + "*" + i + "=" + (num1*i) );
        }
    }
}
