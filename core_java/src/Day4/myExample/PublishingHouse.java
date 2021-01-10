package Day4.myExample;

import java.util.Scanner;

public class PublishingHouse implements Details {

	int pubId;
	String pubName;
	
	@Override
	public void getInfo() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID:");
		pubId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Publishing House Name:");
		pubName=sc.nextLine();
		
	}

	@Override
	public void displayInfo() {
		
		System.out.println("ID:"+pubId);
		System.out.println("Publishing House:"+pubName);
	}

}
