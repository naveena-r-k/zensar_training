package Day2.practice;

public class Example3 {
	//highest value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {2,54,21,6};
		int x=0;
		
		for (int i = 0; i < numbers.length; i++) {
			int y=numbers[i];
			if(x<y) {
				x=y;
			}
		}
		
		
		
		System.out.println("Highest value:"+x);
	}

}
