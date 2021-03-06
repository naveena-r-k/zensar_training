package Day5.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> mapOfStateAndCities = new HashMap<String,String>();
		mapOfStateAndCities.put("Maharashtra", "Pune");
		mapOfStateAndCities.put("Gujurat", "Ahemdabad");
		mapOfStateAndCities.put("Karnataka","Bengaluru");
		mapOfStateAndCities.put("Chattisgarh", "Raipur");
		
		System.out.println(mapOfStateAndCities);
		
		Set<String> mapState = mapOfStateAndCities.keySet();
		
		for(String name:mapState) {
			String city=mapOfStateAndCities.get(name);
			System.out.println(city);
		}
	}

}
