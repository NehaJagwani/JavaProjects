package Multithreading;

public class Lab14_sleep {
    public static void main(String[] args) {
        Test14 t14=new Test14();
        t14.start();
    }
}

class Test14 extends Thread
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            try
            {
                sleep(1000);
                System.out.println(i);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}