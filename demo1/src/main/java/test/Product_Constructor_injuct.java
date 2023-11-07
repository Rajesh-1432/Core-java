package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Product;

public class Product_Constructor_injuct {

	public static void main(String[] args) {
		ApplicationContext container= new ClassPathXmlApplicationContext("resources/product.xml");
        Product p=container.getBean("product",Product.class);
        p.ProductInfo();
	}

}
