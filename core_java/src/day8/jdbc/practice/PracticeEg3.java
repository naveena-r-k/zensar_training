package day8.jdbc.practice;

import java.sql.*;

public class PracticeEg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=getMysqlDbConnection();
		String sql="insert into login values('networkadmin','network@123')";
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			int result=pst.executeUpdate();
			if (result==0) {
				System.out.println("Failed insertion");
			} else {
				System.out.println("Success");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception:"+e);
		}
	}

	public static Connection getMysqlDbConnection() {
		
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword="12345";
		
		Connection con=null;
		try {
			Class.forName(driverClassName);
			con=DriverManager.getConnection(url,dbUserName,dbPassword);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception:"+e);
		}
		
		return con;
	}
}
