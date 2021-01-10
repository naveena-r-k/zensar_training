package Day4.myExample2;

import java.util.Scanner;

public class Rectangle extends Shape {
	
	private double length;
	private double breadth;
	private double peri;
	private double area1;

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		peri=2*(length+breadth);
		System.out.println("Perimeter of rectangle:"+peri);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area1=length*breadth;
		System.out.println("Area of Rectangle:"+area1);
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		length=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter breadth:");
		breadth=sc.nextDouble();
		sc.nextLine();
	}

}
