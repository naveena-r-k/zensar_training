package day7.user_defined_exception;

public class AgeIsNotValidException extends Exception{

	public AgeIsNotValidException() {
		
		System.out.println("Age must be more than 18");
	}
	
	public AgeIsNotValidException(String message) {
		System.out.println(message);
	}
}
