package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ComponentAnnotation_Demo;

public class Component_IOC {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("resources/Component.xml");
		ComponentAnnotation_Demo c1=con.getBean("tst",ComponentAnnotation_Demo.class);
		c1.test();
	}

}
