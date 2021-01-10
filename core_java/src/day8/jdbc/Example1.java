package day8.jdbc;

import java.sql.*;

//demo for jdbc connection
public class Example1 {

	public static void main(String[] args) {
		
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword="12345";
		
		try {
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection:"+con);
			
			String sql="select * from login";
			
			Statement st =con.createStatement();
			ResultSet rt= st.executeQuery(sql);
			while(rt.next()) {
				String userName=rt.getString("user_id");
				String password=rt.getString("password");
				System.out.println("username:"+userName);
				System.out.println("password:"+password);
				System.out.println("****************");
			}
		}
		catch(Exception e){
			System.out.println("Exception:"+e);
		}
	}
}
