package Day5.setExample;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> setOfids= new HashSet<Integer>();
		
		setOfids.add(9856);
		setOfids.add(5961);
		setOfids.add(4103);
	
		for(int x:setOfids) {
			System.out.println(x);
		}
	}

}
