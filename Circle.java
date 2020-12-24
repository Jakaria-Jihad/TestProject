package task14;

import java.util.Scanner;

public class Circle extends Shape{
	// Md. Jakaria Hossain Jihad
//	2011773642

	public Circle(String color) {
		super(color);
		color = "red";
		System.out.println("Circle is "+ color);
	}

	@Override
	public void getArea() {
		double radius;
		 double PI = 3.14;
		 double areaCircle;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter radius of circle - ");
		 radius= sc.nextDouble();
		areaCircle= 2*PI*radius;
		System.out.println("Circle area is - " + areaCircle + "\n");
	}

}
