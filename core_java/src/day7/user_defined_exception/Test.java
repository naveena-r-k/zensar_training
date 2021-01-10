package day7.user_defined_exception;

public class Test {

	public static void checkAge(int age) throws AgeIsNotValidException {
		
		if(age<18) {
			throw new AgeIsNotValidException("Access denied- you must be atleat 18 years old");
		}
		else {
			System.out.println("Access granted");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(11);
		} catch (AgeIsNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
