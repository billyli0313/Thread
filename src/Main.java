import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        // 1. Create a thread by extends the Thread class
//        MyThread myThread = new MyThread();
//        myThread.setName("process 1");
//        myThread.start();
////        MyThread myThread = new MyThread();
////        Thread threadInstance = new Thread(myThread);
////        threadInstance.setName("process 1");
////        threadInstance.start();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " : " + i);
//        }

        // 2. A thread also implements Runnable interface

//        MyThreadRunnable myThread2 = new MyThreadRunnable();
//        Thread threadInstance2 = new Thread(myThread2);
//        threadInstance2.setName("process 2");
//        threadInstance2.start();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " : " + i);
//        }

    /*
     * Why we need multiple threads?
     * It can help to process events at the same time and not interrupt each other,
     * like when you buy tickets online, multiple threads just like multiple windows can process individually.


     * How to solve the potential issue that the same ticket might be sold for multiple times by different windows(threads)?
     * The answer is using lock. - DB lock -
     * lock means only the thread is processing it and can access it, and it’s not available for other threads
     * And synchronized is the keyword of it
     */

        MySynchronizedThread myThread3 = new MySynchronizedThread();
        Thread threadInstance3 = new Thread(myThread3);
        threadInstance3.setName("process 2");
        threadInstance3.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }

        /*
         * ReentrantLock lock - lock before processing - release after process it
         */

        /*
        * What is volatile & atomic variable?
        * volatile variable can be available for all threads
        *
        */


        /*
        * Thread status
        * sleep(500) - will sleep 500 and auto recover to awake status / throttle
        * wait() will along with notify() - you have to manage it
        *
        */


        // 3. Create a thread using Thread Pool (thread safe)
//        MyThreadRunnable thread3 = new MyThreadRunnable();
//        MyThreadRunnable thread4 = new MyThreadRunnable();
//        MyThreadRunnable thread5 = new MyThreadRunnable();
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//        pool.execute(thread3);
//        pool.execute(thread4);
//        pool.execute(thread5);
        /*
        * Callable
        * A task that returns a result and may throw an exception.
        * Implementors define a single method with no arguments method call().
        *
        *
        * Runnable
        * The Runnable interface is a functional interface and has a single run() method that doesn't accept any parameters or return any values.
        *
        */

    }
}