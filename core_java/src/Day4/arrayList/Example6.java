package Day4.arrayList;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * adding of values in arrayList using scanner and loops
 * run a for loop to add 4 cities in arraylist of string and then display all of them
 * names of cities should be received by user-input using Scanner
 * */
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int count;
		
		System.out.println("Enter the number of cities");
		count=sc.nextInt();
		sc.nextLine();
		ArrayList<String> cities =new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter a city Name:");
			String city=sc.nextLine();
			cities.add(city);
		}
		
		System.out.println(cities);
	}

}
