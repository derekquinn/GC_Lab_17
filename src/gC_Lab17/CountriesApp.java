package gC_Lab17;

import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {
	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		int menuChoice;
		String name;
		int population;
		String userContinue = "y";

		System.out.println("Welcome to WORLD BOOKS ENCYCLOPEDIA 1996 -- TRIAL EDITION");
		System.out.println("\n");

		while (userContinue.equalsIgnoreCase("y")) {

			System.out.println("PRESS 1 to see a list of countries.");
			System.out.println("PRESS 2 to add a new country.");
			System.out.println("Press 3 to exit.");

			menuChoice = scnr.nextInt();

			if (menuChoice == 1) {
// printing the list of countries from countries.txt
				CountriesTextFile.readFile();

			}
			if (menuChoice == 2) {
// add new country from user input

				System.out.println("New country name: ");
				name = scnr.next();

				System.out.println("Enter population: ");
				population = scnr.nextInt();

// create a country and assign it to the c1 variable 

				Country c1 = new Country(name, population);
// add c1 (new user generated country) to the file countries.txt
				CountriesTextFile.appendToFile(c1);

			}
			if (menuChoice == 3) {
// exit / goodbye
				System.out.println("Thanks for trying WORLD BOOKS. To order your copy on CD-ROM call 1-888-333-2222");

			}

			System.out.println("Do you want to continue? (Y/N)");
			scnr.nextLine();
			userContinue = scnr.nextLine();

		}
		scnr.close();
// print the countries to prove that we added countries
		System.out.println("[Country] , [Population]");
		CountriesTextFile.readFile();

	}

}