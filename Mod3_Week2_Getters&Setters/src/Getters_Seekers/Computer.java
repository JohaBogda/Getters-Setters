package Getters_Seekers;

public class Computer {

	// Create a Computer class that has 3 variables. The first variable will have a name. The second variable will be the year of the computer. Last variable will be the cost of the computer.

	private String name;
	private int year; 
	private int cost;
	
	// All 3 variables should be private instance variables and must use getters to retrieve the data and setters to set the variables.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		// LONG FORM: 
		Computer ComputerJobs = new Computer();
		ComputerJobs.setName("Wally");
		ComputerJobs.setYear(1995);
		ComputerJobs.setCost(2000);
		
		System.out.println(ComputerJobs.getName());
					
		// SHORT FORM: 
		Computer ComputerGates = new Computer("Bill", 1984, 18);
		System.out.println(ComputerGates.getName());
		
		// change computerJobs' name using the above setters: 
		ComputerJobs.setName("Johanna");
		System.out.println(ComputerJobs.getName());
		
	}
	
	// add a parameterized constructor (Generate constructor using fields) but you need an empty constructor as well:
	// Empty Constructor:
	public Computer() {
	
	}
	
	// paratemized constructor:
	public Computer(String name, int year, int cost) {
		super();
		this.name = name;
		this.year = year;
		this.cost = cost;
	}



}
