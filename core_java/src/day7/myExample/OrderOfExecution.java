package day7.myExample;

public class OrderOfExecution {

	static {
		System.out.println("Static class");
	}
	
	public OrderOfExecution() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	
	static void display() {
		System.out.println("Display func");
	}
	
	public static void main(String[] args) {
		
		new OrderOfExecution();
		display();
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[2]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
		 finally {
			 System.out.println("This is finally block");
		 }
	}
}
