package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sone")
public class Sone extends HttpServlet {
	private static final long serialVersionUID = 1L;
 protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
	PrintWriter out=resp.getWriter();
	resp.setContentType("text/html");
	out.println("<html>");
	out.println("<head>");
	out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
	out.println("</head>");
	out.println("<body style='background:pink'>");
	out.println("<form action='stwo'>");
	out.println("<div class='container' style='width:40%; padding:30px;'>");
	out.println("<label class='control-label'>E_id</label>");
	out.println("<input type='text' class='form-control'><br>");
	req.getRequestDispatcher("stwo").include(req, resp);
	out.println("</div></form></body></html>");

} 
}
