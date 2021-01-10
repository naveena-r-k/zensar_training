package Day5.hashmap;

import java.util.*;
//use of iterator to iterate over the keyset
public class Example3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> mapOfCities= new HashMap<Integer,String>();
		mapOfCities.put(11, "Pune");
		mapOfCities.put(12, "Mumbai");
		mapOfCities.put(54, "Ahmedabad");
		
		System.out.println(mapOfCities);
		
		Set<Integer> keysSet=mapOfCities.keySet();
		
		Iterator<Integer> iter=keysSet.iterator();
		while (iter.hasNext()) {
			int key =iter.next();
			String city=mapOfCities.get(key);
			System.out.println(city);
		}
	}
}
