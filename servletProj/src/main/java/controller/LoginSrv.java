package controller;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginsrv")
public class LoginSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static	String duname;
    static	String dpwd;
     	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
     	String vuname =req.getParameter("uname");
     	String vpwd =req.getParameter("pwd");
     
     	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rajmca");
			String vsql="select * from login";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(vsql);
			HttpSession hession=req.getSession();
			while(rs.next()){
				hession.setAttribute("suname", rs.getString(1));
				hession.setAttribute("spwd", rs.getString(2));
				
				if(vuname.equals(hession.getAttribute("suname")) && vpwd.equals(hession.getAttribute("spwd"))) {
		     		req.getRequestDispatcher("sus.html").forward(req, resp);
		     	}
		     	else {
		     		req.getRequestDispatcher("fail.html").forward(req, resp);
		     	}
			
			}
		
		} catch (Exception e) {
			System.out.println(e);
		}
     	
     	
     	}

}
