package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class srv1 implements Servlet {


	
	ServletConfig config;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("1st init method");
	}
	

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		System.out.println("1st service method");
		int a=10,b=20;
		
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body style='background:pink'>");
		out.println("<div class='container'>");
		out.println("<table class='table table-bordered'>");
		out.println("<tr><th>Operation</th><th>Result</th></tr>  ");
		out.println("<tr>");
		out.println("<td>addition</td>");
		out.println("<td>"+(a+b)+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>substraction</td>");
		out.println("<td>"+(a-b)+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>multiplication</td>");
		out.println("<td>"+(a*b)+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>division</td>");
		out.println("<td>"+(a/b)+"</td>");
		out.println("</tr>");
		out.println("</div>");
		out.println("</body>");
		
		out.println("</html>");
//		
//		out.println("Add of"+(a+b));
//		out.println("sub of"+(a-b));
//		out.println("Mul of"+(a*b));
//		out.println("div of"+(a/b));
//		
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
