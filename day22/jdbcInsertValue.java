package day22;
import  java.sql.*;

public class jdbcInsertValue {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/Muthayammal";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		Statement st = con.createStatement();
		String query = "insert into Students values(1,'Dharun','AI&DS')";
		int status = st.executeUpdate(query);
		if(status == 1) {
			System.out.print("Value Inserted");
		}else {
			System.out.print("Value Not Inserted");
		}
		
	}

}
