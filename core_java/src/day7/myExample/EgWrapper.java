package day7.myExample;

import java.util.*;

public class EgWrapper {

	public static void main(String[] args) {

		String city;
		Double temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter city:");
		city=sc.nextLine();
		System.out.println("Enter temperature:");
		temp=sc.nextDouble();
		
		System.out.println("City:"+city);
		String myString=temp.toString();
		System.out.println(temp+"Celius");
	}

}
