package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/welsrv")
public class Welsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		HttpSession hession=req.getSession();
    		String name=(String)hession.getAttribute("uname");
    		resp.setContentType("text/html");
    		PrintWriter out=resp.getWriter();
    		out.println("<html>");
    		out.println("<head>");
    		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>");
    		out.println("</head>");
    		out.println("<body>");
    		out.println("<div class='container' style='width:40%; padding:30px;background:pink;'>");
    		out.println("<table class='table'>");
    		out.println("<thead>");
    		out.println("<tr class='active'><th>Status</th></tr>");
    		out.println("</thead>");
    		out.println("<tbody>");
    		out.println("<tr><td>"+name+"</td></tr>");
    		out.println("</tbody>");
    		out.println("</table>");
    		
    	//	out.println("");
    		out.println("</div></body></html>");
    	}

}
