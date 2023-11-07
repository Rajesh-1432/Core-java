package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/rsrv")
public class Rsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String veid=req.getParameter("eid");
		String vename=req.getParameter("ename");
		String vesal=req.getParameter("esal");
		
		Cookie C1=new Cookie("ceid",veid);
		Cookie C2=new Cookie("cename",vename);
		Cookie C3=new Cookie("cesal",vesal);
		resp.addCookie(C1);
		resp.addCookie(C2);
		resp.addCookie(C3);
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='container' style='width:40%; padding:30px;background:pink;'>");

		out.println("<form action='vsrv' method='get'>");
		//Hidden Session Tracking Technique
//		out.println("<input type='hidden' name='heid' value="+veid+">");
//		out.println("<input type='hidden' name='hename' value="+vename+">");
//		out.println("<input type='hidden' name='hesal' value="+vesal+">");
//		 
		out.println("<label class='control-label'>S_Id</label>");
		out.println("<input type='text' class=' form-control' name='sid'");
		out.println("<br>");
		out.println("<label class='control-label'>S_Name</label>");
		out.println("<input type='text' class=' form-control' name='sname'");
		out.println("<br>");
		out.println("<label class='control-label'>S_Age</label>");
		out.println("<input type='text' class=' form-control' name='sage'");
		out.println("<br>");
		out.println("<input type='SUBMIT' class='btn btn-primary' value='SUBMIT'>");
		out.println("</form></div></body></html>");

	}

}
