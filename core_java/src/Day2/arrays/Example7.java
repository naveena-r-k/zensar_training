package Day2.arrays;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers= {{2,3,5,7},{4,6,8,10}};
		for (int i = 0; i < numbers.length; i++) {
			int[] innerArray=numbers[i];
			for (int j = 0; j < innerArray.length; j++) {
				System.out.println(innerArray[j]);
			}
		}
	}

}
