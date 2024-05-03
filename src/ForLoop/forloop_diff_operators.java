package ForLoop;

public class forloop_diff_operators {
    public static void main(String[] args) {
        for(int i=1;i<=32;i=i*2)
        {
            System.out.println(i);
        }

        //printing table of 2
        int num=0;
        for (int i=1;i<=10;i++)
        {
            num=num+2;
            System.out.println("2" + "*" + i + "=" + num);
        }
    }
}
