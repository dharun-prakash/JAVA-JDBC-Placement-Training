package day22;
import java.sql.*;

public class jdbcDatabaseCreation {
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		Statement st = con.createStatement();
		String query = "create database Muthayammal";
		int status = st.executeUpdate(query);
		if(status == 1) {
			System.out.print("Database Created");
		}else {
			System.out.print("Database Not Created");
		}
	}

}
