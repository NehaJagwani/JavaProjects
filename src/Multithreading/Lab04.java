//Case 2: Performing single task from multiple threads.

package Multithreading;

public class Lab04 {
    public static void main(String[] args) {
        Test4 t4=new Test4();
        t4.start();
        Test4 tt=new Test4();
        tt.start();
    }
}

class Test4 extends Thread
{
    public void run()
    {
        System.out.println("Executing single task from multiple threads");
    }
}