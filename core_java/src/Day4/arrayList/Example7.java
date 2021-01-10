package Day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> salariesList= new ArrayList<Integer>();
		
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
