package Day3.myExample;

import java.util.Scanner;

import Day3.beans.RegistrationForm;

public class TestForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		String address;
		int contactNum;
		String emailId;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Address:");
		address=sc.nextLine();
		System.out.println("Enter Contact Number:");
		contactNum=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Email:");
		emailId=sc.nextLine();
		
		RegistrationForm rf = new RegistrationForm(name, address, contactNum, emailId);
		TestForm tf= new TestForm();
		tf.displayInfo(rf);
		
		
	}
	
	public void displayInfo(RegistrationForm rf2) {
		System.out.println("Following are the details entered");
		System.out.println("Name:"+rf2.getName());
		System.out.println("Address:"+rf2.getAddress());
		System.out.println("Contact Number:"+rf2.getMobNum());
		System.out.println("Email:"+rf2.getEmailId());
	}
}
