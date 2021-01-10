package Day2.methods;

public class Example3{
	
	public static int add(int x, int y) {
		int z=x+y;
		return z;
	}
	
	public static int subtract(int x, int y) {
		int z=x-y;
		return z;
	}
	
	public static void main(String[] args) {
		int result=add(3,4);
		int result1=add(5,9);
		System.out.println(result);
		System.out.println(result1);
	}
}
