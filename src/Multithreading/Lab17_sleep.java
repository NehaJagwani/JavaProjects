/*
1.

 */
package Multithreading;

public class Lab17_sleep {
    public static void main(String[] args) {
        Test17 t17=new Test17();
        t17.start();

        Test17 tt=new Test17();
        tt.start();
    }
}

class Test17 extends Thread
{
    public void run()
    {
        try
        {
            for (int i=1;i<=5;i++)
            {
                System.out.println(i+" "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}