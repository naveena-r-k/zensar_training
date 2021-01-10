package Day2.arrays;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars= {"BMW","Audi","Mercedes","tesla"};
		
		for (int i = 0; i < cars.length; i++) {
			String car=cars[i];
			System.out.println(car);
		}
		
		for (String x : cars) {
			System.out.println(x);
		}
	}

}
