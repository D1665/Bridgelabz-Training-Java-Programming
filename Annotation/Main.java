package Annotation;

public class Main {
    public static void main(String[] args) {
        
        //code of reflection
        Class c=Employee.class;
        DeveloperInfo d=(DeveloperInfo)c.getAnnotation(DeveloperInfo.class);
        System.out.println(d.name());
        System.out.println(d.date());
        System.out.println(d.version());
        
    }
}
