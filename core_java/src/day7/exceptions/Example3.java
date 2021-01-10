package day7.exceptions;

public class Example3 {

	public static void checkAge(int age) throws Exception {
		
		if(age<18) {
			throw new Exception("Access denied- you must be atleat 18 years old");
		}
		else {
			System.out.println("Access granted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		checkAge(14);
		} 
		catch(Exception e){
			System.out.println(e);
			System.out.println("Something went wrong"+e.getMessage());
		}
		
	}

}
