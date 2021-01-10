package Day2.arrays;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers= {{2,3,5,7},{4,6,8,10}};
		int[] firstNum=numbers[0];
		int[] secondNum=numbers[1];
		for (int i = 0; i < secondNum.length; i++) {
			System.out.println(secondNum[i]);
		}
		System.out.println("*******************");
		for (int i = 0; i < firstNum.length; i++) {
			System.out.println(firstNum[i]);
		}
	}

}
