package DataStructureandAlgorithm.review;


class stack{
    int arr[]=new int[3];
    int top=-1;
    
    void push(int data){
        if(top==2){
            System.out.println("Stack overflow");

        }
        else{
           
            top++;
            arr[top]=data;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{

            System.out.println("pop element is: "+arr[top]);
            top--;
            
            
        }
    }
    
    void peek(){
        System.out.println("top element is: "+arr[top]);
    }
    
    void display(){
        System.out.println("These are following elements which are contained by stack: ");
        for(int i= top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    void minelement(){
        int res=300;
        System.out.println("Minimum element is: ");
        for(int i=0;i<=top;i++){
            res=Math.min(res,arr[i]);
        }
        System.out.println(res);
        
      }
}
public class stackimplementation {
    public static void main(String[] args) {
        stack st1=new stack();
        st1.pop();
        st1.push(-2);
        st1.push(0);
        st1.push(-3);
        st1.push((10));
        st1.minelement();
        st1.pop();
        st1.peek();
        st1.minelement();
        st1.display();
    }
}
