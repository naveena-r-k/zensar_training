package Saturday1.Task1;

import java.util.*;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		//System.out.println();
		College c1= new College("Government", "Pune", 301);
		College c2= new College("Priavte", "Baroda", 10);
		College c3= new College("Autonomous", "Bengaluru", 43);
		
		ArrayList<College> clg =new ArrayList<College>();
		
		clg.add(c1);
		clg.add(c2);
		clg.add(c3);
		
		for(int i=0;i<clg.size();i++) {
			College college= clg.get(i);
			System.out.println(college);
		}
		
		
	}

}
