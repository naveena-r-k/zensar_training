package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Product;
import utility.DBUtil;

public class ProductDAO {

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
	
	public void getAllProduct() {
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="select * from product";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet result=pst.executeQuery();
			while(result.next()) {
				int id=result.getInt("product_id");
				String name=result.getString("product_name");
				int price=result.getInt("product_price");
				System.out.println("Product id:"+id);
				System.out.println("Product Name:"+name);
				System.out.println("Price:"+price);
				System.out.println("***************************");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void getProduct(int productId) {
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="select * from product where product_id=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, productId);
			ResultSet resultSet=pst.executeQuery();
			if(resultSet.next()) {
				int id=resultSet.getInt("product_id");
				String name=resultSet.getString("product_name");
				int price=resultSet.getInt("product_price");
				System.out.println("Product id:"+id);
				System.out.println("Product Name:"+name);
				System.out.println("Price:"+price);
				System.out.println("***************************");
			}
			else {
				System.out.println("Product you mentioned doesnt exist");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteProduct(int id) {
		
		Connection con=DBUtil.getMysqlDbConnection();
		
		String sql="delete from product where product_id=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			int result=pst.executeUpdate();
			if (result==0) {
				System.out.println("deletion failed");
			} else {
				System.out.println("Deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateProduct(Product product) {
		
		Connection con= DBUtil.getMysqlDbConnection();
		
		String sql="update product set product_name=?, product_price=? where product_id=?";
		
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, product.getProductName());
			pst.setInt(2, product.getPrice());
			pst.setInt(3,product.getProductId() );
			int result=pst.executeUpdate();
			if (result==0) {
				System.out.println("updation failed");
			} else {
				System.out.println("Updated....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
