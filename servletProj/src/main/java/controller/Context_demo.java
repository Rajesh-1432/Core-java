package controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Context_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		String vdriver=context.getInitParameter("driver");
		String vurl=context.getInitParameter("url");
		String vname=context.getInitParameter("uname");
		String vpass=context.getInitParameter("pass");
		try {
			Class.forName(vdriver);
			Connection con=DriverManager.getConnection(vurl,vname,vpass);
			String vsql="insert into Student values(?,?,?)";
			PreparedStatement pst=con.prepareStatement(vsql);
			pst.setInt(1, 1001);
			pst.setString(2,"Satya");
			pst.setInt(3, 22);
			int n1=pst.executeUpdate();
			if(n1!=-1) {
				request.getRequestDispatcher("sus.html").forward(request, response);
			}
		} catch (Exception e) {

			System.out.println(e);
		}
		
		
		
	}

}
