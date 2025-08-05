package day22;
import java.util.Scanner;
import java.sql.*;

public class Task_2_MiniProject_1  {
	
	static void viewtable(String url,String un, String pw) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the table name to select : ");
		String table = sc.nextLine();
		Connection con = DriverManager.getConnection(url,un,pw);
		String query = "select * from " + table;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
//		PreparedStatement ps = con.prepareStatement(query);
//		ps.setString(1,table);
//		System.out.print(ps.executeQuery());
			}
	
	public static void main(String[] args) throws SQLException{
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/muthayammal";
		String un = "root";
		String pw = "Dharun@29042005";
		Connection con = DriverManager.getConnection(url,un,pw);
		System.out.println("WELCOME");
		System.out.print("Enter your choice : ");
		System.out.println("\n 1.View \n 2.Create Table \n 3.Insert Data \n 4.Delete \n 5.Exit");
		int inp = sc.nextInt();
		while(inp!=5) {
			if(inp == 1) {
				viewtable(url,un,pw);
			}else if(inp == 2) {
				
			} else if(inp == 3) {
				
			} else if(inp == 4) {
				
			}else {
				System.out.print("Enter the correct number");
			}
			
		}
		
		
	}

}
