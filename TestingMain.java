package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.*;

public class TestingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SampleObject so=new SampleObject();
//		so.setId(50);
		Class mySOClass = SampleObject.class;
		//Class againtest = Class.forName("annotation.SampleObject");
//		System.out.println("id :: "+so.getId());
//		System.out.println("Name :: "+so.getName());
//		System.out.println("Class :: "+so.getClass());
		System.out.println(mySOClass.getName());
		System.out.println("Modifiers :: "+mySOClass.getModifiers());
		Class superclass = mySOClass.getSuperclass();
		//Package package = mySOClass.getPackage();
		Class[] interfaces = mySOClass.getInterfaces();
		 Constructor[] constructors = mySOClass.getConstructors();
		  Method[] methods = mySOClass.getMethods();
		  Field[] field = mySOClass.getFields();
		   Annotation[] annotations = mySOClass.getAnnotations();
//		System.out.println(so.getClass().getName());
		   for(Method method : methods){
			    System.out.println("setter: " + method);
			  }
	}

}
