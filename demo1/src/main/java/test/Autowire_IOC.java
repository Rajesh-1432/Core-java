package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Autowire_Demo;

public class Autowire_IOC {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/Autowired_Demo.xml");
		Autowire_Demo a1=container.getBean("car",Autowire_Demo.class);
		a1.show();
	}

}
