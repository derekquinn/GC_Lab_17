package gC_Lab17;

import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {
	public static void main(String[] args) throws IOException {
		int menuChoice;
		String name;
		int population;
		String userContinue = "y";

		while (userContinue.equalsIgnoreCase("y")) {

			System.out.println("Welcome to WORLD BOOKS ENCYCLOPEDIA 1996 -- TRIAL EDITION");
			System.out.println("\n");
			System.out.println("PRESS 1 to see a list of countries.");
			System.out.println("PRESS 2 to add a new country.");
			System.out.println("Press 3 to exit.");
			System.out.println("Press 4 to delete a country.");

			Scanner scnr = new Scanner(System.in);
			menuChoice = scnr.nextInt();

			if (menuChoice == 1) {
				CountriesTextFile.readFile();

			} else if (menuChoice == 2) {
				// add new country

				System.out.println("New country name: ");
				name = scnr.next();

				System.out.println("Enter population: ");
				population = scnr.nextInt();

				Country c1 = new Country(name, population);
				CountriesTextFile.appendToFile(c1);

				// print list with new country

			} else if (menuChoice == 3) {
				System.out.println("Thanks for trying WORLD BOOKS. To order your copy on CD-ROM call 1-888-333-2222");

			} else if (menuChoice == 4) {
				System.out.println();

			}

			System.out.println("Do you want to continue? (Y/N)");
			scnr.nextLine();
			userContinue = scnr.nextLine();

		}

	}

}