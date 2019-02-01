package gC_Lab17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {
	public static void main(String[] args) throws IOException {
		int menuChoice;
		String name;
		int population;

		printMenu();

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
			// goodbye

		}
		CountriesTextFile.readFile();
		scnr.close();
	}

	public static void printMenu() {
		System.out.println("Welcome to WORLD BOOKS ENCYCLOPEDIA 1996 -- TRIAL EDITION");
		System.out.println("\n");
		System.out.println("PRESS 1 to begin your trip around the world.");
		System.out.println("PRESS 2 to add a new country.");
		System.out.println("Press 3 to exit.");

	}

}
