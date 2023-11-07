package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ssrv")
public class Ssrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   		String veid=req.getParameter("id");
   		String vename=req.getParameter("name");
   		String vesal=req.getParameter("sal");
   		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
   	
		out.println("EID::"+veid+"<hr>");
		out.println("Ename::"+vename+"<hr>");
		out.println("Esal::"+vesal);
		
   	
   	}

}
