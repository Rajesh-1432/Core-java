package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car2;

public class ByType_IOC {

	public static void main(String[] args) {
		ApplicationContext container=
				new ClassPathXmlApplicationContext("resources/Bytype_Demo.xml");
		Car2 c = container.getBean("c2",Car2.class);
		c.show();

	}

}
