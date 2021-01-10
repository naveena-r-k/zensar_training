package day7.myExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EgFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice = null;
		int selection;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Select any one operation to be performed:");
			System.out.println("1.Create file");
			System.out.println("2.Read file");
			System.out.println("3.Write file");
			System.out.println("4.Delete file");
			selection=sc.nextInt();
			sc.nextLine();
			switch (selection) {
			case 1:
				fileCreation();
				System.out.println("Do you want to continue y or n?");
				choice=sc.nextLine();
				break;
			case 2:
				readFile();
				System.out.println("Do you want to continue y or n?");
				choice=sc.nextLine();
				break;
			case 3:
				writeFile();
				System.out.println("Do you want to continue y or n?");
				choice=sc.nextLine();
				break;
			case 4:
				deleteFile();
				System.out.println("Do you want to continue y or n?");
				choice=sc.nextLine();
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		} while (choice.equals("y")||choice.equals("Y"));
	}
		
	
	public static void fileCreation() {
		File file = new File("newfile.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created:"+file.getName());
			} else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:"+e);
		}
	}
	
	public static void readFile() {
		File file=new File("newfile.txt");
		try {
			Scanner reader= new Scanner(file);
			while (reader.hasNext()) {
				String data=reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:"+e);
		}
	}
	
	public static void writeFile() {
		String custName;
		String city;
		String emailId;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name:");
		custName=sc.nextLine();
		System.out.println("Enter city:");
		city=sc.nextLine();
		System.out.println("Enter email id:");
		emailId=sc.nextLine();
		
		try {
			FileWriter file= new FileWriter("newfile.txt");
			file.write(custName+"\n"+city+"\n"+emailId);
			file.close();
			System.out.println("File written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:"+e);
		}
		
	}

	public static void deleteFile() {
		
		File file = new File("newfile.txt");
		if (file.delete()) {
			System.out.println("Deleted the file:"+file.getName());
		} else {
			System.out.println("failed to delete the file");
		}
	}
}
