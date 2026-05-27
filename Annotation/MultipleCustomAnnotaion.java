package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//MultipleCustomAnnotaion
@Target({ElementType.TYPE,ElementType.METHOD}) // its is annotaion on annotaion which specify that this annotaion only works on class and method
@Retention(RetentionPolicy.RUNTIME)
@interface MultipleCustomAnnotaion {
    String name() default "Dinesh";
    String city() default "Mathura";
    
}
