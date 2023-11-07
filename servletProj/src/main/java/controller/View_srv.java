package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vsrv")
public class View_srv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String veid,vename,vesal;
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	  Hidden Session Tracking Technique
//	  String veid=req.getParameter("heid");
//		String vename=req.getParameter("hename");
//		String vesal=req.getParameter("hesal");

	  Cookie []c1=req.getCookies();
	  for(int i=0;i<c1.length;i++) {
		  if(c1[i].getName().equals("ceid"))
		  veid=c1[i].getValue();
		  
		  if(c1[i].getName().equals("cename"))
		  vename=c1[i].getValue();
		  
		  if(c1[i].getName().equals("cesal"))
		  vesal=c1[i].getValue();
	  }
	  System.out.println("E_Id::"+veid);
	  System.out.println("E_Name::"+vename);
	  System.out.println("E_Sal::"+vesal);
		 String vsid=req.getParameter("sid");
	 		String vsname=req.getParameter("sname");
			String vsage=req.getParameter("sage");
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='container' style='width:40%; padding:30px;background:pink;'>");
		out.println("<table class='table'>");
		out.println("<thead>");
		out.println("<tr class='active'><th>Eid</th><th>Ename</th><th>Esal</th></tr>");
		out.println("</thead>");
		out.println("<tbody>");
		out.println("<tr><td>"+veid+"</td><td>"+vename+"</td><td>"+vesal+"</td></tr>");
		out.println("</tbody>");
		out.println("</table>");
		
		out.println("<table class='table'>");
		out.println("<thead>");
		out.println("<tr class='active'><th>Sid</th><th>Sname</th><th>Sage</th></tr>");
		out.println("</thead>");
		out.println("<tbody>");
		out.println("<tr><td>"+vsid+"</td><td>"+vsname+"</td><td>"+vsage+"</td></tr>");
		out.println("</tbody>");
		out.println("</table>");
		out.println("</div></body></html>");
		
	}

}
