package MultipleThreads.ProducerAndConsumerProblem;

class Consumer extends Thread {

    private Buffer buffer;

    Consumer(Buffer buffer){

        this.buffer = buffer;
    }

    @Override
    public void run() {

        try{

            for(int i=1;i<=5;i++){

                buffer.consume();

                Thread.sleep(1500);
            }

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}
