package FirstProject;

import java.util.Scanner;

public class Rectangle1 {
	private double longSide;
	private double shortSide;

	public double area() {
		double area = longSide * shortSide;
		return area;
	}

	public double perimeter() {
		double perimeter = (longSide + shortSide) * 2;
		return perimeter;
	}

	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give us the values for rectangle's long and short sides");
		this.longSide = scanner.nextDouble();
		this.shortSide = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("What would you like to calculate (area, perimeter or both)?");
		String answer = scanner.nextLine();
		switch (answer) {
		case "area":
			System.out.println("Rectangle's area is " + area());
			break;
		case "perimeter":
			System.out.println("Rectangle's perimeter is " + perimeter());
			break;
		case "both":
			System.out.println("Rectangle's area is " + area());
			System.out.println("Rectangle's perimeter is " + perimeter());
			break;
		default:
			System.out.println("input error");
		}
	}
}