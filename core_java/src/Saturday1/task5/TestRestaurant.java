package Saturday1.task5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurant r = new Restaurant(101,"Stephen", 501);
		Restaurant r1= new Restaurant(102,"Mark", 1000);
		Restaurant r2= new Restaurant(105, "Anne", 359);
		
		Set<Restaurant> restro= new HashSet<Restaurant>();
		
		restro.add(r);
		restro.add(r1);
		restro.add(r2);
		
		Iterator<Restaurant> iter= restro.iterator();
		while (iter.hasNext()) {
			Restaurant restaurant = iter.next();
			System.out.println(restaurant);
		}
	}

}
