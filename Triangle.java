package task14;

import java.util.Scanner;

public class Triangle extends Shape {
	// Md. Jakaria Hossain Jihad
//	2011773642

	public Triangle(String color) {
		super(color);
		System.out.println("Triangle is "+ color);
	}

	@Override
	public void getArea() {
		double base, height,areatriangle;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter base of triangle - ");
		base = sc1.nextDouble();
		System.out.println("Enter height of triangle - ");
		height = sc1.nextDouble();
		areatriangle = base*height*(.5);
		System.out.println("Triangle area is - " + areatriangle + "\n");
		
	}

}
