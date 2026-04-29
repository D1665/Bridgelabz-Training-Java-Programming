package Object_Oriented_Programming.Review;

class variables{
    static int var1=4;
    int var2;
    int var3;
    variables(int var2,int var3){
        this.var2=var2;
        this.var3=var3;
    }
    static void display(){
        System.out.println("this is display method of parent class");
    }
    void print(){
        System.out.println("this is print method of parent class");
    }
}
class variables1 extends variables{
    variables1(int var2, int var3) {
        super(var2, var3);
       
    }

    static void display(){
        System.out.println("this is display method of child class");
        
    }
    void print(){
        System.out.println("this is print method of child class");
    }

}
public class variable {
    public static void main(String[] args) {
        variables v1=new variables1(3, 0); //

        variables1 v2=new variables1(0, 0);
        
        v1.display();  ///---->      
        v1.print();  //---    >  
        //v2.display();
       // v2.print();
        

        
    }
}
