package task14;

import java.util.Scanner;

public class Rectangle extends Shape {
	// Md. Jakaria Hossain Jihad
//	2011773642

	public Rectangle(String color) {
		super(color);
		System.out.println("Rectangle is "+ color);
	}

	@Override
	public void getArea() {
		double height, width, arearectangle;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter height of rectangle - ");
		height = sc2.nextDouble();
		System.out.println("Enter width of rectangle - ");
		width = sc2.nextDouble();
		arearectangle = height*width;
		System.out.println("Rectangle area is - " + arearectangle + "\n");
		
	}

}
