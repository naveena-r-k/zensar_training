package Day2.practice;

public class Example4 {

	public static int area(int x, int y) {
		int z=x*y;
		return z;
	}
	
	public static float area(float x, float y) {
		float z=x*y;
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=area(3,5);
		float result1=area(2.1f,7.1f);
		System.out.println(result);
		System.out.println(result1);

		
	}

}
