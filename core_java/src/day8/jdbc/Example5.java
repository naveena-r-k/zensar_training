package day8.jdbc;

import utility.DBUtil;

import java.sql.*;

public class Example5 {

	public static void main(String[] args) {
		
		String userName="john";
		String pwd="123";
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="select * from login where user_id=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet result=pst.executeQuery();
			while(result.next()) {
				String pwddb=result.getString("password");
				if (pwd.equals(pwddb)) {
					System.out.println("Login Successful");
				} else {
					System.out.println("Login failed");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception...."+e);
		}
		
		
	}
}
