package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginsrv2")
public class Loginsrv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	resp.setContentType("text/html");
		String vuname=req.getParameter("uname");
	String vpwd=req.getParameter("pwd");
	if(vuname.equals("Raj") && vpwd.equals("Raj@1432")) {
		out.println("Welcome :: "+vuname);
		HttpSession hession=req.getSession();
		hession.setAttribute("suname", vuname);
		hession.setAttribute("spwd", vpwd);
	
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body style='background:pink'>");
		out.println("<div class='container' style='width:40%; padding:30px;'>");
		out.println("<h5>"+vuname+"</h5>");
		out.println("<form action='logout'>");
		out.println("<input type='SUBMIT' class='btn btn-default' value='LogOut'>");
		//out.println("<input type='SUBMIT' class='btn btn-default' value='OK'>");
		out.println("</form></div></body></html>");
	}
	else {
		
	}
	}

}
