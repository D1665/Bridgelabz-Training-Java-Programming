package Annotation;

@MultipleCustomAnnotaion(name="Sirsiya",city="Aligarh")
public class Demo {


   
   @MarkerCustomAnnotation
   static int addTwonum(int n1,int n2){
       return n1+n2;
   }
   @ImportantTask
   static int mulTwonum(int n1,int n2){
      return n1*n2;
   }
   public static void main(String[] args) {
      
      @SingleCustomAnnotation(myvalue = 30)
      int n=10;
   }

    
}
