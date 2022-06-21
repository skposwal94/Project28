package classPrograms;

public class Laptop {
	
	String laptopName;
	int ramSize;
	String processorType;
	
	
	// method to initialize variables 
	void method(String name, int ram, String processor){
		laptopName = name;
		ramSize = ram;
		processorType = processor;
		
	}
	
	// Parameterized constructor 
	
	public Laptop(String laptopName, int ramSize, String processorType) {
		this.laptopName = laptopName;
		this.ramSize = ramSize;
		this.processorType = processorType;
	}
	
	// One Non parameterized constructor to allow methods to run as well
	
	public Laptop() {
	}
	

}
