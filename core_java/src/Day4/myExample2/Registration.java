package Day4.myExample2;

import java.util.Scanner;

public class Registration implements Printable {
	
	String name;
	String city;
	Double mobNo;

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter City:");
		city=sc.nextLine();
		System.out.println("Enter Mobile Number:");
		mobNo=sc.nextDouble();
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		System.out.println("The details filled are:");
		System.out.println("Name:"+name);
		System.out.println("City:"+city);
		System.out.println("Mobile Number:"+mobNo);

	}

}
