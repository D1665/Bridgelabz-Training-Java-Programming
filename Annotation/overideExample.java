package Annotation;

class parent{
    void display(){
        System.out.println("this parent class method");
    }
}

class child extends parent {
    @Override
    void display(){
        System.out.println("this is child class method");
    }

    
}

public class overideExample {
    public static void main(String[] args) {
        child c=new child();
        c.display();
    }
    
}
