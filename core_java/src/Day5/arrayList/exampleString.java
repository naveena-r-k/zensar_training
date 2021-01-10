package Day5.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class exampleString {

	public static void main(String[] args) {
		
		int num;
		String movie;
		ArrayList<String> movies= new ArrayList<String>();
		System.out.println("Enter the number of movies you want to enter:");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the movie name:");
		for (int i = 0; i < num; i++) {
			movie=sc.nextLine();
			movies.add(i, movie);
		}
		
		System.out.println("Movies:");
		for (String string : movies) {
			System.out.println(string);
		}
	}
}
