package MultipleThreads;


class MyTask implements Runnable {

    @Override
    public void run() {

        System.out.println(
                "Task Executing"
        );
    }
}
public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {

        MyTask task =
                new MyTask();

        Thread t =
                new Thread(task);

        t.start();
    }

}
