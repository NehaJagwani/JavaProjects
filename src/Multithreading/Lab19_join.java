/*
1. join() is used if a thread wants to wait for another thread to complete its execution.
2. Methods: a). public final void join() throws InterruptedException
            b). public final synchronized void join(long ms)
            c). public final synchronized void join(long ms, int ns) throws InterruptedException
*/

package Multithreading;

public class Lab19_join {
    public static void main(String[] args) {
        Test19 t19=new Test19();
        t19.start();
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Main thread"+" "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Test19 extends Thread{
    public void run()
    {
        try
        {
            for (int i = 1; i <=5 ; i++) {
                System.out.println("child thread"+" "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
