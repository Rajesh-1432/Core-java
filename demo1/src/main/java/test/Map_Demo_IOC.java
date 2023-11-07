package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Emp1;

public class Map_Demo_IOC {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/Map_Demo.xml");
		Emp1 em=container.getBean("emp1",Emp1.class);
		em.show();

	}

}
