package day8.jdbc;

import utility.DBUtil;

import java.sql.*;

public class Example6 {

	public static void main(String[] args) {
		
		String userName="john";
		String pwd="123";
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="select * from login where user_id=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet result=pst.executeQuery();
			if(result.next()) {
				String uname=result.getString("user_id");
				String pwddb=result.getString("password");
				if ((userName.equals(uname)&&(pwd.equals(pwddb)))) {
					System.out.println("Login Successful");
				} else {
					System.out.println("Login failed");
				}
			}
			else {
				System.out.println("User not found....");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception...."+e);
		}
		
		
	}
}
