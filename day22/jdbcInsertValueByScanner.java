package day22;
import java.sql.*;
import java.util.Scanner;


public class jdbcInsertValueByScanner {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/Muthayammal";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		String query = "insert into Students values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		System.out.println("Enter Sno");
		String sno = sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Dept");
		String dept = sc.nextLine();
		ps.setString(1, sno);
		ps.setString(2,name);
		ps.setString(3, dept);
		System.out.print(ps.executeUpdate());
		
		
	}

}
