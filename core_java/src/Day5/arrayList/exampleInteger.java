package Day5.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class exampleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int roll;
		
		ArrayList<Integer> rollNum= new ArrayList<Integer>();
		
		System.out.println("Enter the number of students:");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the roll Number:");
		for (int i = 0; i < num; i++) {
			roll=sc.nextInt();
			rollNum.add(i, roll);
			//sc.nextLine();
		}
		
		System.out.println("Roll No who were present");
		
		for (int i = 0; i < num; i++) {
			System.out.println(rollNum.get(i));
		}
		
		rollNum.removeAll(rollNum);
		
		//System.out.println(rollNum);
	}

}
