package Day5.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import Day5.arrayList.bean.Customer;

public class ExampleBean {

	public static void main(String[] args) {
		
		Customer c= new Customer("Neha","Pune",859870);
		Customer c1= new Customer("Sejal","Ahmedabad",6516778);
		Customer c2= new Customer("Bhumi","Mumbai",785694);

		ArrayList<Customer> customer= new ArrayList<Customer>();
		customer.add(c);
		customer.add(c1);
		customer.add(c2);
		
		Iterator<Customer> iter = customer.iterator();
		while (iter.hasNext()) {
			Customer cust1 = iter.next();
			System.out.println(cust1);
		}
		
	}
}
