package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//SingleCustomAnnotation
@Target(ElementType.LOCAL_VARIABLE)  // its is annotaion on annotaion which specify that this annotaion only works on local variable
@interface SingleCustomAnnotation {
    int myvalue () default 0;
    
}
