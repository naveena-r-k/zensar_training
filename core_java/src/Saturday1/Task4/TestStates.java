package Saturday1.Task4;

import java.util.HashSet;
import java.util.Set;

public class TestStates {

	public static void main(String[] args) {
		
		States s = new States(411017, "Pune");
		States s1= new States(530068, "Banglore");
		States s2= new States(600001, "Chennai");
		
		Set<States> states1 = new HashSet<States>();
		
		states1.add(s);
		states1.add(s1);
		states1.add(s2);
		
		for (States states : states1) {
			System.out.println(states);
		}
	}
	
}
