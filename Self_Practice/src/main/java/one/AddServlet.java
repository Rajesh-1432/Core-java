package one;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		ServletContext context=getServletContext();
		String vdriver=context.getInitParameter("driver");
		String vurl=context.getInitParameter("url");
		String vname=context.getInitParameter("uname");
		String vpass=context.getInitParameter("pass");
		int s1=Integer.parseInt(req.getParameter("college_code"));
		String s2=req.getParameter("password");
		String s3=req.getParameter("college_name");
		String s4=req.getParameter("address");
		String s5=req.getParameter("society_name");
		int s6=Integer.parseInt(req.getParameter("year_of_establishment"));
		String s7=req.getParameter("correspondent_name");
		int s8=Integer.parseInt(req.getParameter("correspondent_contact_number"));
		String s9=req.getParameter("correspondent_email_id");
		String s10=req.getParameter("principal_name");
		int s11=Integer.parseInt(req.getParameter("principal_contact_number"));
		String s12=req.getParameter("college_website");
		String s13=req.getParameter("principal_email_id");
		String s14=req.getParameter("building_type");
		int s15=Integer.parseInt(req.getParameter("mca_intake"));
		int s16=Integer.parseInt(req.getParameter("mba_intake"));
		try {
			Class.forName(vdriver);
			Connection con=DriverManager.getConnection(vurl,vname,vpass);
			String vsql="insert into clg_reg values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(vsql);
			pst.setInt(1, s1);
			pst.setString(2, s2);
			pst.setString(3, s3);
			pst.setString(4, s4);
			pst.setString(5, s5);
			pst.setInt(6, s6);
			pst.setString(7, s7);
			pst.setInt(8, s8);
			pst.setString(9, s9);
			pst.setString(10, s10);
			pst.setInt(11, s11);
			pst.setString(12, s12);
			pst.setString(13, s13);
			pst.setString(14, s14);
			pst.setInt(15, s15);
			pst.setInt(16, s16);
			int n1=pst.executeUpdate();
			if(n1!=-1) {
				req.getRequestDispatcher("sus.html").forward(req, resp);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
	
