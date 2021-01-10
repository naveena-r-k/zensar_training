package Day2.practice;
/*Write a Java program to find sum of values of a given array.*/
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {69,85,66,80,81};
		int sum=0;
		for (int i = 0; i < marks.length; i++) {
			 sum=sum+marks[i];
		}
		System.out.println("REsult:"+sum);
		int result=sum/marks.length;
		System.out.println("Avg:"+result);
	}

}
