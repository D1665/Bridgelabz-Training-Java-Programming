package MultipleThreads;

class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println(
                "Child Thread Running");
    }
}

public class ThreadUsingthreadclass {

    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start();

        System.out.println(
                "Main Thread Running");

    }

}
