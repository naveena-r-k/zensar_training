package Saturday1.task6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b= new Bank(56001, "Sejal");
		Bank b2= new Bank(320001, "Manoj");
		Bank b3= new Bank(65781, "Yadnesh");
		
		Map<Integer,Bank> bank= new HashMap<Integer,Bank>();
		
		bank.put(1,b);
		bank.put(2, b2);
		bank.put(3,b3);
		
		Set<Integer> ba= bank.keySet();
		
		for (Integer num : ba) {
			Bank bank2=bank.get(num);
			System.out.println(num+" "+bank2);
		}
	}

}
