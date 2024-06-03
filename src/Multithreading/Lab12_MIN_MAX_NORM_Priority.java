package Multithreading;

public class Lab12_MIN_MAX_NORM_Priority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
    }
}
