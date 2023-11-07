package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.College;

public class ByName_IOC {

	public static void main(String[] args) {
		ApplicationContext container=
				new ClassPathXmlApplicationContext("resources/ByName_Demo.xml");
		College c2=container.getBean("college",College.class);
		c2.CollegeInfo();
	    


	}

}
