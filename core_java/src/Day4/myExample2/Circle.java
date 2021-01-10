package Day4.myExample2;

import java.util.Scanner;

public class Circle extends Shape {

	private int radius;
	private double area1;
	private double circum;
	
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		circum=2*3.14*radius;
		System.out.println("Circumference of circle:"+circum);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area1=2.14*radius*radius;
		System.out.println("Area of circle:"+area1);
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius=sc.nextInt();
		sc.nextLine();
	}

}
