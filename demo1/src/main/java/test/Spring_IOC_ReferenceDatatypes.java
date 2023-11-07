package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Spring_IOC_ReferenceDatatypes {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/Ref_Engine_InnerBeen.xml");
		Car c= container.getBean("car",Car.class);
		c.CarInfo();

	}

}
