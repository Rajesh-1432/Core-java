package data_access_obj;

import java.sql.*;
public class Login_dao {
	static boolean b;
	public boolean vaidate(String uname,String pwd) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rajmca");
			String vsql="select * from login where uname=? and pwd=?";
			PreparedStatement pst=con.prepareStatement(vsql);
			pst.setString(1, uname);
			pst.setString(2, pwd);
			ResultSet rs=pst.executeQuery();
			b=rs.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return b;
	}
}
