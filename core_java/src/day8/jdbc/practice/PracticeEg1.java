package day8.jdbc.practice;

import java.sql.*;

public class PracticeEg1 {

	public static void main(String[] args) {

		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbUsername="root";
		String dbPassword="12345";
		
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUsername, dbPassword);
			
			String sql="select * from login";
			
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(sql);
			while(rs.next()) {
				String uname=rs.getString("user_id");
				String pwd=rs.getString("password");
				System.out.println("Username:"+uname);
				System.out.println("Password:"+pwd);
				System.out.println("****************");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception:"+e);
		}
		
	}

}
