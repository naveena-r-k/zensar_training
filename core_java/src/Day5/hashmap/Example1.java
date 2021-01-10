package Day5.hashmap;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> mapOfCities= new HashMap<Integer,String>();
		mapOfCities.put(11, "Pune");
		mapOfCities.put(12, "Mumbai");
		mapOfCities.put(54, "Ahmedabad");
		
		System.out.println(mapOfCities);
		
		Set<Integer> keysSet=mapOfCities.keySet();
		
		for(int x:keysSet) {
			String city=mapOfCities.get(x);
			System.out.println(x+" "+city);
		}
	}
}
