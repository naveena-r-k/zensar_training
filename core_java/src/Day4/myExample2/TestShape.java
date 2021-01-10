package Day4.myExample2;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Select the shape:\n1.Circle\n2.Rectangle");
		choice=sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			Circle c= new Circle();
			c.getInfo();
			c.perimeter();
			c.area();
			break;
		case 2:
			Rectangle r = new Rectangle();
			r.getInfo();
			r.perimeter();
			r.area();
			break;
		default:
			System.out.println("Invalid choice!!!!");
		}
	}

}
