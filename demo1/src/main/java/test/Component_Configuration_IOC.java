package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import beans.Component_Configuration_Demo;
import beans.Component_Configuration_Demo1_1;

public class Component_Configuration_IOC {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(Component_Configuration_Demo1_1.class);
		Component_Configuration_Demo s1=con.getBean("saddar",Component_Configuration_Demo.class);
		s1.show();

	}

}
