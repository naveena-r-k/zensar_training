package Day5.LinkedList2;

import java.util.LinkedList;
import java.util.Collections;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> salariesList= new LinkedList<Integer>();
		
		salariesList.add(140000);
		salariesList.add(20000);
		salariesList.add(30000);
		salariesList.add(890000);
		Collections.sort(salariesList);
		//Collections.reverse(salariesList);
		//Collections.sort(salariesList, Collections.reverseOrder()); for reversing of string
		for (int x : salariesList) {
			System.out.println(x);
		}
		
	}
}
