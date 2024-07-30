package jdbc23;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcexample {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","root");
     java.sql.Statement st = con.createStatement();
     System.out.println("insert records");
     String sql="insert into student values(2,'gkj','cse')";
     st.executeUpdate(sql);
	}

}
