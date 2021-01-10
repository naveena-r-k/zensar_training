package day7.threadseg;

public class TestExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 example2= new Example2();
		Thread thread1= new Thread(example2);
		thread1.start();
		
	}

}
