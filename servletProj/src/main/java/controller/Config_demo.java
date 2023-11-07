package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Config_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletConfig config=getServletConfig();
		String veid=config.getInitParameter("eid");
		String vename=config.getInitParameter("ename");
		String vesal=config.getInitParameter("esal");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body style='background:pink'>");
		out.println("<div class='container' style='width:40%; padding:30px;'>");
		out.println("<table class='table table-bordered'>");
		out.println("<thead><tr class='active'><th>Status</th></tr></thead>");
		out.println("<tbody><tr><td>"+veid+"</td>");
		out.println("<td>"+vename+"</td>");
		out.println("<td>"+vesal+"</td>");
		out.println("</tr></tbody></div></body></html>");
		
	}

}
