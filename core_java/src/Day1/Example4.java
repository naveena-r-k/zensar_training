package Day1;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int employeeId = 20123;
		String name = "John";
		System.out.println(employeeId + " "+ name);
		System.out.println("changing employeeId..");
		//employeeId = 50717;->generates error as final variable are constant
		System.out.println(employeeId + " "+ name);
	}

}
