package controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class serv1 implements Servlet {

	
	ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("1st init method");
	}
	

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println("1st service method");
		int a=10,b=20;
		
		System.out.println("Add of"+(a+b));
		System.out.println("sub of"+(a-b));
		System.out.println("Mul of"+(a*b));
		System.out.println("div of"+(a/b));
		
	}
	

	@Override
	public ServletConfig getServletConfig() {
		
		return this.config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "WElcome";
	}


	@Override
	public void destroy() {
		this.config=null;
		System.out.println("Destroy Method");
		
	}

}
