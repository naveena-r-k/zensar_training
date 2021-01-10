package Day4.myExample2;

import java.util.Scanner;

public class SimpleInterest implements Printable{

	double amount;
	double year;
	double rateOfInterest;
	double interestAmt;
	
	@Override
	public void getData() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount:");
		amount=sc.nextDouble();
		System.out.println("Enter number of years:");
		year=sc.nextDouble();
		System.out.println("Enter rate of interest:");
		rateOfInterest=sc.nextDouble();
		
	}

	@Override
	public void showData() {

		interestAmt=(amount*year*rateOfInterest)/100;
	    System.out.println("Simple Interest:"+interestAmt);
	}

}
