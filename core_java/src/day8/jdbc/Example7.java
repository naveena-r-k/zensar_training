package day8.jdbc;

import beans.Product;
import utility.DBUtil;
import java.sql.*;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1= new Product(1, "USB", 340);
		Example7 example= new Example7();
		example.addProduct(product1);
	}

	public void addProduct(Product product) {
		System.out.println("Now going to insert into product into db:"+product);
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="insert into product values(?,?,?)";
		
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			pst.setInt(1, product.getProductId());
			pst.setString(2,product.getProductName());
			pst.setInt(3, product.getPrice());
			int result=pst.executeUpdate();
			if (result==0) {
				System.out.println("Query failed");
			} else {
				System.out.println("Success");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
