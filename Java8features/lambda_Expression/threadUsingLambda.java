package Java8features.lambda_Expression;

public class threadUsingLambda {
    public static void main(String[] args) {
        Runnable thread1=()->{

            //this is the body of thread 
            //stuff
            for (int i = 2; i <=10; i++) {
                System.out.println("Value of i is: "+i);
                
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
                e.printStackTrace();
            }

        };

        Thread t=new Thread(thread1);
        t.setName("JOHN");
        t.start();
    }
}
