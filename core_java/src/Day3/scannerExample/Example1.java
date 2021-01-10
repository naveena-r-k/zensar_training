package Day3.scannerExample;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		String userName=sc.nextLine();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("UserName:"+userName);
		System.out.println("Age:"+age);
	}

}
