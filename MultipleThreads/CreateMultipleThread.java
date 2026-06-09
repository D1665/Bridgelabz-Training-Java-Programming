package MultipleThreads;

class MyThread extends Thread {

    @Override
    public void run() {

        for(int i=1;i<=5;i++){

            System.out.println(
                    Thread.currentThread().getName()
                    + " : " + i
            );
        }
    }
}

public class CreateMultipleThread {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");


        t1.start();
        t2.start();
        t3.start();
    }

}
