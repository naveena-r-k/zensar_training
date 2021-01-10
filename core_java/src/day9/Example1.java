package day9;

import beans.Product;
import utility.DBUtil;
import java.sql.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1= new Product(2, "Mobile", 34000);
		ProductDAO example= new ProductDAO();
		//example.addProduct(product1);
		//example.getAllProduct();
		example.getProduct(3);
		//example.deleteProduct(1);
		
		Product product= new Product(2,"Laptop", 54000);
		example.updateProduct(product1);
	}

	
}
