package day7.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter file = new FileWriter("courses.txt");
			file.write("Core java");
			file.write("\nAdvance java");
			file.write("\nPython");
			file.close();
			System.out.println("Written in file successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in creating file"+e);
		}
	}

}
