package day7.file_handling;

import java.io.File;

//deleting file
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("courses.txt");
		boolean fileExist= file.exists();
		if (fileExist) {
			System.out.println("File exist");
			boolean deleteFile=file.delete();
			if (deleteFile) {
				System.out.println("File has deleted");
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("File does not exist");
		}
	}

}
