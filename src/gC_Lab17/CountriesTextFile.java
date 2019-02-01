package gC_Lab17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountriesTextFile {
	// this takes the string representation of the path object and converts it to a
	private static Path filePath = Paths.get("countries.txt");

	public static void appendToFile(Country country) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}

		List<String> countryList = Arrays.asList(country.toString());
		Files.write(filePath, countryList, StandardOpenOption.APPEND);
	}

	/// trying to get/print players from players.txt by reading the file
	
	public static void readFile() throws IOException {
		/// this read all lines assigns this to a line of strings ("Player, 23" is an
		/// entire string)
		List<String> lines = Files.readAllLines(filePath);

		//List<Country> ccounountries = new ArrayList<>();

		for (String thisLine : lines) {
			System.out.println(thisLine);

		}

	}

}
