package MultipleThreads;

/*
===========================================================
JAVA MULTITHREADING - IMPORTANT THREAD METHODS DEMO
===========================================================

This program demonstrates:

1. run()
2. start()
3. currentThread()
4. getName()
5. setName()
6. getPriority()
7. setPriority()
8. sleep()
9. join()
10. yield()
11. interrupt()

-----------------------------------------------------------
IMPORTANT THEORY
-----------------------------------------------------------

run()
-----
Contains the actual task performed by a thread.

start()
-------
Creates a new thread and internally calls run().

Difference:

t.run();   -> Normal method call
t.start(); -> Creates a new thread

currentThread()
---------------
Returns reference of currently executing thread.

getName()
---------
Returns thread name.

setName()
---------
Changes thread name.

getPriority()
-------------
Returns thread priority.

setPriority()
-------------
Changes thread priority.

sleep()
--------
Pauses current thread for specific time.

join()
-------
Makes one thread wait for another thread.

yield()
--------
Gives CPU opportunity to other threads.

interrupt()
------------
Interrupts a sleeping/waiting thread.

===========================================================
*/

class DemoThread extends Thread {

    @Override
    public void run() {

        /*
         * currentThread()
         * Returns currently executing thread.
         */
        System.out.println(
                "\nCurrent Thread : "
                        + Thread.currentThread()
        );

        /*
         * getName()
         * Returns thread name.
         */
        System.out.println(
                "Thread Name : "
                        + getName()
        );

        /*
         * getPriority()
         * Returns thread priority.
         */
        System.out.println(
                "Thread Priority : "
                        + getPriority()
        );

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.println(
                        getName()
                                + " -> Count : "
                                + i
                );

                /*
                 * yield()
                 * Suggests scheduler to give CPU
                 * to another thread.
                 */
                Thread.yield();

                /*
                 * sleep()
                 * Pause current thread for 1 second.
                 */
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {

            System.out.println(
                    getName()
                            + " was interrupted while sleeping."
            );
        }

        System.out.println(
                getName()
                        + " finished execution."
        );
    }
}

public class AllmethodsOfThread {

    public static void main(String[] args)
            throws Exception {

        /*
         * currentThread()
         */
        System.out.println(
                "Current Main Thread : "
                        + Thread.currentThread()
        );

        /*
         * getName()
         */
        System.out.println(
                "Default Main Thread Name : "
                        + Thread.currentThread().getName()
        );

        /*
         * setName()
         */
        Thread.currentThread()
                .setName("Main-Thread");

        System.out.println(
                "Updated Main Thread Name : "
                        + Thread.currentThread().getName()
        );

        /*
         * getPriority()
         */
        System.out.println(
                "Default Priority : "
                        + Thread.currentThread()
                        .getPriority()
        );

        /*
         * setPriority()
         */
        Thread.currentThread()
                .setPriority(Thread.MAX_PRIORITY);

        System.out.println(
                "Updated Priority : "
                        + Thread.currentThread()
                        .getPriority()
        );

        /*
         * Creating Threads
         */
        DemoThread t1 = new DemoThread();
        DemoThread t2 = new DemoThread();

        /*
         * setName()
         */
        t1.setName("Worker-1");
        t2.setName("Worker-2");

        /*
         * setPriority()
         */
        t1.setPriority(8);
        t2.setPriority(3);

        /*
         * start()
         *
         * Creates separate threads.
         */
        t1.start();
        t2.start();

        /*
         * join()
         *
         * Main thread waits until
         * Worker-1 completes.
         */
        t1.join();

        System.out.println(
                "\nMain Thread resumed after Worker-1 finished."
        );

        /*
         * interrupt()
         *
         * Interrupt Worker-2 while sleeping.
         */
        System.out.println(
                "\nInterrupting Worker-2..."
        );

        t2.interrupt();

        /*
         * join()
         *
         * Wait for Worker-2 also.
         */
        t2.join();

        System.out.println(
                "\nAll Threads Finished."
        );

        /*
         * run() vs start()
         *
         * Calling run() directly does NOT create
         * a new thread.
         */
        System.out.println(
                "\nCalling run() directly..."
        );

        DemoThread t3 = new DemoThread();
        t3.setName("Direct-Run-Thread");

        /*
         * Normal method call
         */
        t3.run();

        System.out.println(
                "\nProgram Finished."
        );
    }
}
