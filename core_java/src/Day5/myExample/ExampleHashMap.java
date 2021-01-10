package Day5.myExample;

import java.util.HashMap;

public class ExampleHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,Double> result= new HashMap<Integer,Double>();
		
		result.put((int)010, 65.2);
		result.put(2, 91.23);
		result.put(5, 86.90);
		
		System.out.println(result);
	}
}
