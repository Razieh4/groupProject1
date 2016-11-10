package FirstProject;

import java.util.Scanner;

public class Triangle1 {
	private double firstSide;
	private double secondSide;
	private double thirdSide;

	public double area() {
		double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
		double temporary = halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide)
				* (halfPerimeter - thirdSide);
		double area = Math.sqrt(temporary);
		return area;
	}

	public double perimeter() {
		double perimeter = firstSide + secondSide + thirdSide;
		return perimeter;
	}

	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give us the values for triangle's three sides");
		this.firstSide = scanner.nextDouble();
		this.secondSide = scanner.nextDouble();
		this.thirdSide = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("What would you like to calculate (area, perimeter or both)?");
		String answer = scanner.nextLine();
		switch (answer) {
		case "area":
			System.out.println("Triangle's area is " + area());
			break;
		case "perimeter":
			System.out.println("Triangle's perimeter is " + perimeter());
			break;
		case "both":
			System.out.println("Triangle's area is " + area());
			System.out.println("Triangle's perimeter is " + perimeter());
			break;
		default:
			System.out.println("input error");
		}
	}
}
