package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;


@WebServlet("/Http_derver_Demo2")
public class Http_derver_demo2 extends HttpServlet {
	//ServletConfig config;
	private static final long serialVersionUID = 1L;
     
//   	public void init(ServletConfig config) throws ServletException {
//   		this.config=config;
//		System.out.println("initialize init method");
//	}
	protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body style='background:pink'>");
		out.println("<div class='container' style='width:40%; padding:30px;'>");
		out.println("<a href='webpage.html'>click me</a>");
		out.println("</div></body></html>");

	}

   	
   	public void destroy() {
		System.out.println("destroy");
	}

}
