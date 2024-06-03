/*
1. It is used to interrupt an executing thread.
2. It will only work when the thread is in sleeping/waiting state. (sleep()/wait())
3. If a thread is not in sleeping/waiting, then calling an interrupt method will perform normal behaviour.
4. when we use an interrupt(), it throws InterruptedException
5. Method: public void interrupt()
*/

package Multithreading;

public class Lab20_Interrupt {
    public static void main(String[] args) {
        Test20 t20=new Test20();
        t20.start();
        t20.interrupt();
    }
}

class Test20 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName()+ " "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
