package Java8features.lambda_Expression;

public class main {
    public static void main(String[] args) {

        //first way is traditional way that create seprate class then implement the interface then create object of 
        // this class in main class 
        myInterface mi=new myinterfaceImp();
      
        mi.sayHello();

        //second way is using anonymous class that create direct object of interface in main class using anonymous class so no need
        // to create extra class 
        myInterface m1=new myInterface() {
            @Override
            public void sayHello(){
                System.out.println("say hello using anonymous class");
            }
        };

        //third way is using lambda expression that not need to create any classes 

        myInterface m2=()->{
            System.out.println("say hello using lambda expression");
        };
        m2.sayHello();



        myinterface2 m3=(a,b)-> {
             return a+b;
        };

        System.out.println(m3.sum(4,5 ));
        System.out.println(m3.sum(89, 45));


        
    }
}
