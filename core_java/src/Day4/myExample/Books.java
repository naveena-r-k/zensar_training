package Day4.myExample;

import java.util.Scanner;

public class Books extends PublishingHouse implements Details {

	String title;
	String author;
	String pubName;
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter title:"+title);
		title=sc.nextLine();
		System.out.println("Enter author:"+title);
		title=sc.nextLine();
		System.out.println("Enter pubName:"+title);
		title=sc.nextLine();
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Publishing House:"+pubName);

	}
	
}
