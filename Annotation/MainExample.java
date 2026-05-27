package Annotation;

public class MainExample {
    public static void main(String[] args) {
        Demo d=new Demo();
        Class c=d.getClass();
        System.out.println(c.getName());
        MultipleCustomAnnotaion an=(MultipleCustomAnnotaion) c.getAnnotation(MultipleCustomAnnotaion.class);
        System.out.println(an.name());
        System.out.println(an.city());
        
    }
}
