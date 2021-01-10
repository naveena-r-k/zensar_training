package Day3.myExample;
import Day3.beans.*;

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate myDate=new MyDate();
		TestMyDate testMyDate= new TestMyDate();
		testMyDate.displayDate(myDate);
		
		System.out.println("Updating date.....");
		myDate.setDate(2);
		myDate.setMonth(12);
		myDate.setYear(2020);
		testMyDate.displayDate(myDate);
		
		System.out.println("Updating date again....");
		MyDate myDate2= new MyDate(3, 12, 2020);
		testMyDate.displayDate(myDate2);
	}	
	
	public void displayDate(MyDate m) {
		System.out.println("Date:"+m.getDate()+"/"+m.getMonth()+"/"+m.getYear());
	}
}
