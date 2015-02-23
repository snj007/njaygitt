package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface TesterInfo {
 
	public enum Priority {
	   LOW, MEDIUM, HIGH
	}
 
	Priority priority() default Priority.MEDIUM;
	String[] tags() default "";
	String createdBy() default "Mkyong_Sanjay_Branch_second_master";
	String createdBy() default "Mkyong_Sanjay";
	String master;
 
	String lastModified() default "03/01/2014";
 
}