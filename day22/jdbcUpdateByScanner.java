package day22;
import java.util.*;
import java.sql.*;

public class jdbcUpdateByScanner {
	public static void main(String[] args) throws SQLException{
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/muthayammal";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		String query = "update students set name = ?";
		PreparedStatement ps = con.prepareStatement(query);
		System.out.print("Enter the name : ");
		String name = sc.nextLine();
		ps.setString(1, name);
		System.out.print(ps.executeUpdate());
	}

}
