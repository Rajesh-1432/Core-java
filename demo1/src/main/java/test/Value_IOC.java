package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ValueAnnotation_Demo;

public class Value_IOC {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/Value_Demo.xml");
		ValueAnnotation_Demo v1=container.getBean("teacher",ValueAnnotation_Demo.class);
		v1.show();

	}

}
