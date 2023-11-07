package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Admin;

public class Sprin_ioc {

	public static void main(String[] args) {
		ApplicationContext container= new ClassPathXmlApplicationContext("resources/spring.xml");
		Admin a=container.getBean("admin",Admin.class);
		a.adminInfo();

	}

}
