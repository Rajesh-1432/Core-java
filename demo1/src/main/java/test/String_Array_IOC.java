package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.String_Array;
public class String_Array_IOC {

	public static void main(String[] args) {
		ApplicationContext container= new ClassPathXmlApplicationContext("resources/String_Array.xml");
		String_Array s= container.getBean("car",String_Array.class);
		s.show();

	}

}
