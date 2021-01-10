package day7.file_handling;

import java.io.*;

public class Example1 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("F:\\course.txt");
			boolean result=file.createNewFile();
			
			if (result) {
				System.out.println("File created successfully:"+file.getName());
			} else {
				System.out.println("File already exist");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured:"+e);
		}
	}
}
