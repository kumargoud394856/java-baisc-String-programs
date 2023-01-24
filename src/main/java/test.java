import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.ojas.CMS.query.query;

public class test {
	
	public static void main(String[] args) throws Exception {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
		
		 PreparedStatement ps = con.prepareStatement("SELECT roles.rname FROM cms.roles WHERE rid = (SELECT rid FROM cms.users u WHERE u.uname=? AND u.pass=?)");
		 System.out.println(ps);
		 ps.setString(1, "admin");
		 ps.setString(2, "admin");
		 
		 ResultSet rs=ps.executeQuery();
		 if(rs!=null) {
			 rs.next();
			System.out.println( rs.getString(1));
		 }
		 
		 
	}

}
