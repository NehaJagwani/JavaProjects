/*
use getName() to get the name of the current thread.
getname() method of thread class
 */

package Multithreading;

public class Lab07_getName {
    public static void main(String[] args) {
        System.out.println("Hello is printed by"+" : "+Thread.currentThread().getName());
        Test7 t7=new Test7();
        t7.start();
    }
}

class Test7 extends Thread{
    public void run()
    {
        System.out.println("Thread task is executed by"+" : "+Thread.currentThread().getName());
   }
}