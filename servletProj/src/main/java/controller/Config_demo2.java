package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Config_demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().append("Served at: ").append(req.getContextPath());
		ServletConfig config= getServletConfig();
		String vsid=getInitParameter("S_id");
		String vsname=getInitParameter("S_Name");
		String vsage=getInitParameter("S_Age");
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.print("<html><head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body style='background:gray'>");
		out.println("<div class='container' style='width:40%; padding:30px;'>");
		out.println("<table class='table table-bordered'>");
		out.println("<thead><tr class='active'><th>Status</th></tr></thead>");
		out.println("<tbody><tr><td>"+vsid+"</td>");
		out.println("<td>"+vsname+"</td>");
		out.println("<td>"+vsage+"</td>");
		out.println("</tr></tbody></div></body></html>");

	}

}
