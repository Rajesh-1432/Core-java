package test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Required_annotation;

public class Required_Demo_IOC {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("resources/Required_Demo.xml");
		Required_annotation r1=con.getBean("stu",Required_annotation.class);
		r1.show();
	}

}
