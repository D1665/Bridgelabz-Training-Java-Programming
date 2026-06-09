package MultipleThreads.ProducerAndConsumerProblem;

class Producer extends Thread {

    private Buffer buffer;

    Producer(Buffer buffer){

        this.buffer = buffer;
    }

    @Override
    public void run() {

        try{

            for(int i=1;i<=5;i++){

                buffer.produce(i);

                Thread.sleep(1000);
            }

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}
