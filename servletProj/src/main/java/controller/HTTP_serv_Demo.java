package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HTTP_SERV_Demo")
public class HTTP_serv_Demo extends HttpServlet {
	ServletConfig config;
	private static final long serialVersionUID = 1L;
     
	public void init(ServletConfig config) throws ServletException {
	   this .config=config;
	   System.out.println("1st init mtd ");
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body style='background:pink'>");
		out.println("<div class='container' style='width:40%; padding:30px;'>");
		out.println("<label class='control-label'>EID</label>");
		out.println("<input type='text' class=' form-control' name='eid'");
		out.println("<br>");
		out.println("<label class='control-label'>E_Name</label>");
		out.println("<input type='text' class=' form-control' name='eid'");
		out.println("<br>");
		out.println("<label class='control-label'>E_Salary</label>");
		out.println("<input type='text' class=' form-control' name='eid'");
		out.println("<br>");
		out.println("<input type='SUBMIT' class='btn btn-default' value='SUBMIT'>");
		out.println("</div></body></html>");
	}


	public void destroy() {
		System.out.println("Destroy Method");
	}
	
}
