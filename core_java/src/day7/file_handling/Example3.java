package day7.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("courses.txt");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				String x=sc.nextLine();
				System.out.println(x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error !!!"+e);
		}
	}

}
