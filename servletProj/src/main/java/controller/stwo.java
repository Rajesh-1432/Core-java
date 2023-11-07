package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/stwo")
public class stwo extends HttpServlet{
	private static final long serialVersionUID = 1L;
	 protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println("<label class='control-label'>E_name</label>");
		out.println("<input type='text' class='form-control'><br>");
		out.println("<label class='control-label'>E_sal</label>");
		out.println("<input type='text' class='form-control'><br>");
		out.println("<button class='success'>submit</button><br>");
	 
	 
	 
	 }
	 
}
