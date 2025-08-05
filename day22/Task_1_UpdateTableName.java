package day22;
import java.util.Scanner;
import java.sql.*;

public class Task_1_UpdateTableName {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/muthayammal";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		for(int i = 0 ; i <3 ; i++) {
		String query = "update students set name=? where name=?";
		PreparedStatement ps = con.prepareStatement(query);
		System.out.println("Set name");
		String whatName = sc.nextLine();
		System.out.println("where name");
		String name = sc.nextLine();
		ps.setString(1, whatName);
		ps.setString(2, name);
		System.out.print("Update "+ i + " "+ ps.executeUpdate());
		}
		
	}

}
