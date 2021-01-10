package Saturday1.Task2;

/*Snehal*/
import java.util.ArrayList;

public class TestDepartment {

	public static void main(String[] args) {
		
		Department d = new Department(101, "Income Tax", "Mumbai");
		Department d1= new Department(301, "Health Care", "Chennai");
		Department d2= new Department(501,"Broadcasting","Delhi");
		
		ArrayList<Department> dept = new ArrayList<Department>();
		
		dept.add(d);
		dept.add(d1);
		dept.add(d2);
		
		for (Department department : dept) {
			System.out.println(department);
		}
	}
}
