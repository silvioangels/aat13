
package edu.strategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(value={ElementType.METHOD, ElementType.TYPE})
public @interface GoodCodeSample {
    
    CodeCategory value();
    String comment() default "";
    
}
