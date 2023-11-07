package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fsrv")
public class Fsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String veid=req.getParameter("eid");
		String vename=req.getParameter("ename");
		String vesal=req.getParameter("esal");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<a href=ssrv?id="+veid+"&name="+vename+"&sal="+vesal+" >Sending Request</a>");
		
   	
   	}

}
