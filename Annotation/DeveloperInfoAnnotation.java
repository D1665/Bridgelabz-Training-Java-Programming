package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DeveloperInfo{
    String name() default "Dinesh";
    String date() default "29 may 2026";
    double version() default 1.0;
}