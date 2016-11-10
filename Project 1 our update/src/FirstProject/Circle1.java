package FirstProject;

import java.util.Scanner;

public class Circle1 {

	private double radius;

	public double area() {
		double area = radius * radius * Math.PI;
		return area;
	}

	public double circumference() {
		double circumference = radius * 2 * Math.PI;
		return circumference;

	}

	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give us the values for circle's radius!");
		this.radius = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("What would you like to calculate (area, circumference or both)?");
		String answer = scanner.nextLine();
		switch (answer) {
		case "area":
			System.out.println("Circle's area with radius " + radius + " is " + area());
			break;
		case "circumference":
			System.out.println("Circle's circumference with radius " + radius + " is " + circumference());
			break;
		case "both":
			System.out.println("Circle's area with radius " + radius + " is " + area());
			System.out.println("Circle's circumference with radius " + radius + " is " + circumference());
			break;
		default:
			System.out.println("input error");
		}
	}
}
