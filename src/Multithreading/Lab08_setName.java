/* to set the name of the thread, use setName()
setname() method of thread class.
setname() can be used in 2 ways:
1. Create an object of a class, then use object reference.setname("give name here")
2. use Thread.currentThread().setname("give name here")
*/


package Multithreading;

public class Lab08_setName {
    public static void main(String[] args) {

        //Method1 to set the thread name
        Thread.currentThread().setName("Neha");
        System.out.println("Hello is printed by"+" "+Thread.currentThread().getName());

        Test8 t8=new Test8();
        //Method2 to set the thread name
        t8.setName("Raghu");
        t8.start();
    }
}

class Test8 extends Thread{
    public void run()
    {
        System.out.println("Thread task is executed by"+" : "+Thread.currentThread().getName());
    }
}
