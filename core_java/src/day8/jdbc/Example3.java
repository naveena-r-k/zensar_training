package day8.jdbc;

import java.sql.*;

//insert data into login using Statement
public class Example3 {

	public static void main(String[] args) {

		Connection con=getMysqlDbConnection();
		String sql="insert into login values('frontdesk','5678')";
		try {
			Statement st=con.createStatement();
			int result=st.executeUpdate(sql);//this method can be used for insert/update/delete
			if (result==0) {
				System.out.println("Insertion failed");
			} else {
				System.out.println("Insertion successful");
			}
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}
	
	public static Connection getMysqlDbConnection() {
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword="12345";
		
		Connection con= null;
		
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, dbUserName, dbPassword);
		}
		catch(Exception e) {
			System.out.println("Exception:"+e);
		}
		return con;
	}
}
