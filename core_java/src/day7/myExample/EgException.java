package day7.myExample;

import java.util.Scanner;

public class EgException {

	public static void main(String[] args) {
		
		String str1=null;
		int length;
		
		/*try {
			System.out.println("in try block");
			System.out.println(str1.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("String is needed");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		str1=sc.nextLine();
		System.out.println(str1.length());
		
	}
}
