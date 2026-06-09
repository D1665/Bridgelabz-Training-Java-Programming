package MultipleThreads.ProducerAndConsumerProblem;

class Buffer {

    private int data;

    private boolean available = false;

    public synchronized void produce(int value)
            throws Exception {

        while(available){

            wait();
        }

        data = value;

        available = true;

        System.out.println(
                "Produced : " + data
        );

        notify();
    }

    public synchronized void consume()
            throws Exception {

        while(!available){

            wait();
        }

        System.out.println(
                "Consumed : " + data
        );

        available = false;

        notify();
    }
}
