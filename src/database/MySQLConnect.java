package database;
import java.sql.*;

public class MySQLConnect {

	public static void main(String[] args) throws Exception {
	String url = "jdbc:mysql://localhost:3306/school";
	String username = "root";
	String password = "a3mjt4hupz";
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con = DriverManager.getConnection(url,username,password);
	 System.out.println("database connected succesfully");
	 Statement st = con.createStatement();
	 ResultSet rs = st.executeQuery("select * from Students");
	 while(rs.next()) {
		 String name = rs.getString("name");
		 System.out.println(name);
	 }
	 st.close();
	 con.close();
	 System.out.println("database connection closed");
	 
	}

}
