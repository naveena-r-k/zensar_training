package Day4.myExample2;

import java.util.Scanner;

public class TestPrintable {

	public static void main(String[] args) {
		
		int choice;
		System.out.println("Select options:\n1.Calculate Interest\n2.Registraton");
		Scanner sc= new Scanner(System.in);
		choice=sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			SimpleInterest si = new SimpleInterest();
			si.getData();
			si.showData();
			break;
		case 2:
			Registration r= new Registration();
			r.getData();
			r.showData();
			break;
		default:
			System.out.println("Invalid options selected!!");
		}
		
	}
}
