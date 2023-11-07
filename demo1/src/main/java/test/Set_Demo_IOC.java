package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Set_Demo;

public class Set_Demo_IOC {

	public static void main(String[] args) {
		ApplicationContext Container=new ClassPathXmlApplicationContext("resources/Set_Demo.xml");
		Set_Demo s1=Container.getBean("company",Set_Demo.class);
		s1.show();

	}

}
