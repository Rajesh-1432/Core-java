package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Emp;

public class Emp_setterInjuctionDemo {

	public static void main(String[] args) {
		ApplicationContext container= new ClassPathXmlApplicationContext("resources/emp.xml");

		Emp e=container.getBean("emp",Emp.class);
		e.empInfo();
	}

}
