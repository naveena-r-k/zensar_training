package Day1.strings;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = '1';
		// int i = (int) c1;
		int i = Character.getNumericValue(c1);
		System.out.println(c1+" "+i);
        
        //double cannot be directly converted to char
		double value = 22.2;
        char c2 = (char) value;
        System.out.println(value+"  "+c2);
	}

}
