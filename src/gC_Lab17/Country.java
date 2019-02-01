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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;

	}
	@Override
	public String toString() {
		return name +", "+ population;
	}

}
