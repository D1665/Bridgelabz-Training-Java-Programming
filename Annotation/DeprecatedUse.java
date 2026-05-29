package Annotation;

class parent{
    @Deprecated
    void oldlogin(){
        System.out.println("this is old login");
    }
    void newlogin(){
        System.out.println("this is new login");
    }
}


public class DeprecatedUse {
    public static void main(String[] args) {
        parent p=new parent();
        p.oldlogin();
        p.newlogin();
    }
    
}
