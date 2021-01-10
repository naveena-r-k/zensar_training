package day7.exceptions;

public class Example2 {

	public static void checkAge(int age) {
		
		if(age<18) {
			throw new ArithmeticException("Access denied- you must be atleat 18 years old");
		}
		else {
			System.out.println("Access granted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(19);
	}

}
