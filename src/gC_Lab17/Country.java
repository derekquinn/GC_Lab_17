package gC_Lab17;

public class Country {

	// instance variables / fields (same thing)
	private String name;
	private int population;

// no argument constructor 
	public Country() {

	}

// 2 argument constructor
	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}

// getter for name
	public String getName() {
		return name;
	}

//  setter for Name with one param

	public void setName(String name) {
		this.name = name;
	}

// getter for population
	public int getPopulation() {
		return population;
	}

// setter for population with one param
	public void setPopulation(int population) {
		this.population = population;

	}

	@Override
	public String toString() {

		return name + ", " + population;
	}
}
