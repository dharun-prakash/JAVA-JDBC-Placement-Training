package day22;
import java.sql.*;

public class jdbcTableCreation  {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/Muthayammal";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		Statement st = con.createStatement();
		String query = "create table Students(sno int,name varchar(50),dept varchar(50))";
		int status = st.executeUpdate(query);
		if(status == 0) {
			System.out.print("Table Created");
		}else {
			System.out.print("Table Not Created");
		}
		
		
	}

}
