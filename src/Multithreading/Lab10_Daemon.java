/*
Properties of Daemon thread:
1. Dameon threads run in background of other threads and provide service to those threads.
2. Ex of Daemon threads: Garbage collector, finalizer, signal dispatches.
3. Methods: a. public final void setDameon(boolean b): this will convert the thread in a daemon thread.
            b. public final boolean isDaemon(): Returns true if its a Dameon thread else false.
4. We have to create Daemon thread before starting the thread. If I do it after the start(), then it will throw
RunTimeException i.e. IllegalThreadStateException
5. We cannot set main thread as the Daemon thread else runtime exception will be thrown.
6. Inside the main(), if I write Thread.currentThread.setDameon(true), it will throw runtime exception.
7. It's life depends on the main thread.
8. Daemon thread inherits the properties from its parent thread meaning whichever thread is creating
the daemon thread, daemon thread will inherit its properties.
9. JVM"s role in Daemon thread: If onky daemin thread is running, then JVM wil kill the daemon thread.
10. Always keep priorities of Daemon thread to low, we can change its priorities according to our needs.
11. If you comment main thread, dameon thread will not be executed
*/

package Multithreading;

public class Lab10_Daemon {
    public static void main(String[] args) {

        //If you comment main thread, daemon thread will not be executed
        System.out.println("Main thread");
        Test10 t10=new Test10();

        //Daemon thread is creating before the start()
        t10.setDaemon(true);
        t10.start();
    }
}

class Test10 extends Thread
{
    public void run() {
        //below will return true
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Child thread");
    }
}