package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Scope_Vars;

public class Scope_vars_IOC {

	public static void main(String[] args) {
		ApplicationContext container= new ClassPathXmlApplicationContext("resources/Scope_vars.xml");
		Scope_Vars v1=container.getBean("v",Scope_Vars.class);
		Scope_Vars v2=container.getBean("v",Scope_Vars.class);
		Scope_Vars v3=container.getBean("v",Scope_Vars.class);
		Scope_Vars v4=container.getBean("v",Scope_Vars.class);

	}

}
