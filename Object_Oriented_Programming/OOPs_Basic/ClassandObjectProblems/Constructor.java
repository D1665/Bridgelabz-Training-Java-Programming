package Object_Oriented_Programming.OOPs_Basic.ClassandObjectProblems;


public class Constructor {

    int n;
    int m;

    //default constructor or non-parameterized constructor
    public Constructor(){
        System.out.println("creating object and its default constructor");

    }
    //parameterized constructor 
    public Constructor(int n){
        this.n=n;
        System.out.println("its parameter constructor");
    }
     //parameterized constructor 
    public Constructor(int n,int m){
        this.n=n;
        this.m=m;
        System.out.println("its another parameterized constructor");
    }
    public static void main(String[] args) {
        Constructor c=new Constructor();
        Constructor c2=new Constructor(0);
        Constructor c3=new Constructor(0,1);

    }
    
    

}
