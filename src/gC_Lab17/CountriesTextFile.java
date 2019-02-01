package gC_Lab17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CountriesTextFile {
	// this takes the string representation of the path object and converts it to a
	private static Path filePath = Paths.get("countries.txt");

// makes sure that the file exists before we continue, create if it doesnt continue
	public static void appendToFile(Country country) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
// add user input to the list 
		List<String> countryList = Arrays.asList(country.toString());
		Files.write(filePath, countryList, StandardOpenOption.APPEND);
	}

/// trying to get/print countries from countries.txt by reading the file
	
	public static void readFile() throws IOException {
		/// this read all lines assigns this to a line of strings 
		List<String> lines = Files.readAllLines(filePath);

		for (String thisLine : lines) {
			System.out.println(thisLine);

		}

	}

}
