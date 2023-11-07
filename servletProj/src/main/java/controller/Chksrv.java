package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data_access_obj.*;
@WebServlet("/chksrv")
public class Chksrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
   	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Login_dao obj=new Login_dao();
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		if(obj.vaidate(uname, pwd)) {
			HttpSession hession=req.getSession();
			hession.setAttribute("uname", uname);
			hession.setAttribute("pwd", pwd);
			req.getRequestDispatcher("welsrv").forward(req, resp);
		}
		else {
		req.getRequestDispatcher("login.html").forward(req, resp);
		}
   	}

}
