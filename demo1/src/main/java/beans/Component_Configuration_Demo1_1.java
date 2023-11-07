package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="beans")
public class Component_Configuration_Demo1_1 {
	@Bean(name = {"Rajesh","demo","saddar"})
	public Component_Configuration_Demo getm1() {
		Component_Configuration_Demo h1= new Component_Configuration_Demo();
		return h1;

	}

}
