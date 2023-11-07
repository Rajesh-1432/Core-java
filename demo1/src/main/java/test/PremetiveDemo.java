package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.PremetiveBeanDemo;

public class PremetiveDemo {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/Premetive.xml");
		PremetiveBeanDemo p1=container.getBean("premetive",PremetiveBeanDemo.class);
		p1.show();
	}

}
