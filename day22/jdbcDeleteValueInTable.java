package day22;
import java.sql.*;

public class jdbcDeleteValueInTable {
	public static void main(String[] args)throws SQLException {
		String url = "jdbc:mysql://localhost:3306/muthayammal";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		Statement st = con.createStatement();
		String query = "delete from students where name = 'Prakash'";
		System.out.print(st.executeUpdate(query));
	}

}
