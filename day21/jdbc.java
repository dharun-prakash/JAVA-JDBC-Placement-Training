package day21;
import java.sql.*;

public class jdbc {
	public static void main(String[] args) throws SQLException {
		String url  = "jdbc:mysql://localhost:3306/artist";
		String un = "root"; 
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		String query = "select * from md";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(2) + " ");
			System.out.println(rs.getString(3) + " ");
			System.out.println("-----------------------");
		}
		
	}

}
