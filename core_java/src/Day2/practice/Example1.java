package Day2.practice;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] flowers= {"Lily","Mogra","Champa","Jasmine"};
		for (int i = 0; i < flowers.length; i++) {
			String flower=flowers[i];
			System.out.println(flower);
		}
		for (String flower : flowers) {
			System.out.println(flower);
		}
	}

}
