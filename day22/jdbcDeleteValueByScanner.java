package day22;
import java.sql.*;
import java.util.Scanner;;

public class jdbcDeleteValueByScanner {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/muthayammal";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		String query = "delete from students where name = ?";
		PreparedStatement ps = con.prepareStatement(query);
		System.out.print("Enter the Name : ");
		String name = sc.nextLine();
		ps.setString(1, name);
		System.out.print(ps.executeUpdate());
		
		
		
		
	}

}
