package Saturday1.task7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestPerfume {
	
	public static void main(String[] args) {
		
		Perfume p= new Perfume("Flourish","Peter England",150.00,390);
		Perfume p1= new Perfume("The Pride","Armaf",100.00,2000);
		Perfume p2= new Perfume("Hero","Park Avenue",155.00,250);

		Map<Integer,Perfume> perf= new HashMap<Integer,Perfume>();
		
		perf.put(1, p);
		perf.put(2, p1);
		perf.put(3,p2);
		
		Set<Integer> keySet= perf.keySet();
		
		Iterator<Integer> iter= keySet.iterator();
		while (iter.hasNext()) {
			Integer x =  iter.next();
			System.out.println(x+" "+perf.get(x));
		}
	}
}
