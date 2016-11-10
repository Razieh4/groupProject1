package FirstProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean continueGame = true;
		while (continueGame) {

			System.out.println("Please choose a figure (triangle, rectangle or circle):");
			String figureName = scanner.nextLine();

			if (figureName.equalsIgnoreCase("triangle")) {
				Triangle1 t = new Triangle1();
				t.playGame();
			}

			else if (figureName.equalsIgnoreCase("circle")) {
				Circle1 c = new Circle1();
				c.playGame();
			}

			else if (figureName.equalsIgnoreCase("rectangle")) {
				Rectangle1 r = new Rectangle1();
				r.playGame();
			} else {
				System.out.println("input error");
			}
			System.out.println("Would you like to continue? yes / no");
			String a = scanner.nextLine();
			if (a.equalsIgnoreCase("no")) {
				continueGame = false;
				System.out.println("Thank you for play!");
			} else if (a.equalsIgnoreCase("yes")) {

			}
		}
	}
}
