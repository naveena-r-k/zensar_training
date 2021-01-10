package day7.file_handling;

import java.io.*;

public class Example5 {

	public static void main(String[] args) {
		
		try {
		File folder= new File("D:\\test1");
		folder.mkdir();
		boolean folderExist=folder.exists();
		if (folderExist) {
			System.out.println("File name test1 exist");
			System.out.println("Now we are going to delete the folder");
			folder.delete();
			System.out.println("Folder deleted");
		} else {
			System.out.println("Folder doesnt exist ");
		}
		}
		catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}
