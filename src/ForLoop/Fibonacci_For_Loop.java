package ForLoop;

public class Fibonacci_For_Loop {
    public static void main(String[] args) {
        int prev=0;
        int next=1;
        int total=0;
        System.out.print(prev+" ");
        System.out.print(next+" ");
        for(int i=1;i<=10;i++)
        {
            total = prev + next;//total=2
            prev=next; //prev=1
            next=total;//next=2
            System.out.print(total);
            System.out.print(" ");
        }
    }
}
