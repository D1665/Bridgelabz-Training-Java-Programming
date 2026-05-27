package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//marker annotation

@Target(ElementType.METHOD)   // its is annotaion on annotaion which specify that this annotaion only works on method
@interface MarkerCustomAnnotation{

}

