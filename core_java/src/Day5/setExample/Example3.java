package Day5.setExample;

import java.util.HashSet;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		
		Set<String> states= new HashSet<String>();
		
		states.add("Maharashtra");
		states.add("Telangana");
		states.add("Karnataka");
		
		for (String st : states) {
			System.out.println(st);
		}
	}
}
